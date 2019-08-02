grammar SAS;
import  CommonGrammar,AbortStmt, ProcStmt, ArrayStmt, AssignmentStmt,FreeSAS,
	ByStmt, CallStmt, DataStmt, DatalinesStmt, DropStmt, InfileStmt, InputStmt, MeansProc,
	RunStmt;


/* this grammar implements this script
data crime;
  infile "crime.csv" delimiter="," firstobs=2;
  input sid state $ crime murder pctmetro pctwhite pcths poverty single;
run;

proc means data = crime;
  var crime poverty single;
run;
*/
parse :(sas_stmt_block)*EOF
 ;

// a statement block is either data statement, procedure block or new lines
sas_stmt_block :
data_stmt_block
;

// must treat NEWLINE by hand, since raw data often delimited by newline
data_stmt_block :data_stmt
data_stmt_list+
// RUN ';'
;

data_stmt_list
:infile_stmt
|input_stmt
|abort_stmt
|array_stmt
|by_stmt
|call_stmt
|datalines_stmt
|datalines4_stmt
|delete_stmt
|drop_stmt
|data_stmt
|if_stmt
|if_then_else_stmt
|infile_stmt
|input_stmt
|put_stmt
|means_proc
|proc_stmt// assign must go last
|assign_stmt
|run_stmt
 ;

if_stmt
 : IF expression ';'
 ;

if_then_else_stmt
 : IF expression THEN sas_stmt_list (ELSE sas_stmt_list)?
 ;

delete_stmt : DELETE ';' ;

// TODO: incomplete
/*infile_stmt
 : INFILE file_specification infile_options* ';'
 ;

file_specification
 : STRINGLITERAL  //filename
 | CARDS
 | DATALINES
 ;

infile_options
 : DELIMITER EQUAL STRINGLITERAL
 | DELIM EQUAL STRINGLITERAL
 | FIRSTOBS EQUAL INT
 | OBS '=' INT
 ;


input_stmt
 : INPUT ('$'|Identifier)+ ';'
 ;
*/









/*
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

*/




//end
