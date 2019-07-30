grammar InfileStmt;

/* this grammar implements this script
data crime;
  infile "crime.csv" delimiter="," firstobs=2;
  input sid state $ crime murder pctmetro pctwhite pcths poverty single;
run;

proc means data = crime;
  var crime poverty single;
run;
*/
parse
 : (sas_stmt_block)* EOF
 ;

// a statement block is either data statement, procedure block or new lines
sas_stmt_block
 : data_stmt_block
 ;

// must treat NEWLINE by hand, since raw data often delimited by newline
data_stmt_block : DATA Identifier ';'
   data_stmt_list*
   RUN ';'
 ;

data_stmt_list
 : infile_stmt
 | input_stmt
 ;

// TODO: incomplete
infile_stmt
 : INFILE file_specification infile_options* ';'
 ;

file_specification
 : STRINGLITERAL  //filename
 | CARDS
 | DATALINES
 ;

infile_options
 : DELIMITER '=' STRINGLITERAL
 | FIRSTOBS '=' INT
 | OBS '=' INT
 ;

input_stmt
 : INPUT ('$'|Identifier)+ ';'
 ;

INPUT : 'input';
INFILE: 'infile' ;
CARDS : 'cards' ;
INT : DIGIT+ ;
DIGIT: [0-9];
DATALINES : 'datalines' ;
FIRSTOBS : 'firstobs' ;
OBS: 'obs' ;
RUN:'run';
DELIMITER : 'delim' | 'delimiter' ;
STRINGLITERAL
    :   '"' ( ESC | ~[\\"] )* '"'
    |   '\'' ( ESC | ~[\\'] )* '\''
    ;
fragment ESC :   '\\' [abtnfrv"'\\]    ;
DATA : 'data' ;
Identifier : [a-zA-Z_] [a-zA-Z_0-9]*;
WS:[ \n\t\r]+ -> skip;

//end
