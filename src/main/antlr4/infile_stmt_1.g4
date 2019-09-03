grammar infile_stmt_1;
import CommonGrammar ;
// import CommonLexerRules, CommonParserRules;
// options {tokenVocab=CommonLexerRules;}

infile_main
 : (infile_stmt)* EOF
 ;
infile_stmt
 : INFILE file_specification device_type? infile_options* operating_environment_options* ';'
 ;

file_specification
 : STRINGLITERAL
 | Identifier
 | CARDS
 | CARDS4
 | DATALINES
 | DATALINES4
 ;
 
device_type
 : DISK
 | DUMMY
 | GTERM
 | PIPE
 | PLOTTER
 | PRINTER
 | TAPE
 | TEMP
 | TERMINAL
 | UPRINTER
 ;
 
// FIXME: here delimiter allows both character and string
infile_options
 : Identifier EQUAL expression
 | DSD
 | EXPANDTABS 
 | NOEXPANDTABS
 | FLOWOVER
 | MISSOVER
 | PAD 
 | NOPAD
 | SCANOVER
 | SHAREBUFFERS
 | STOPOVER
 | TRUNCOVER
 | V_INFILE_
 | DELIMITER EQUAL STRINGLITERAL
 | DELIM EQUAL STRINGLITERAL
 | FIRSTOBS EQUAL INT
 | OBS '=' INT
  ;

operating_environment_options
  : BLKSIZE '=' Identifier
    |BLK '=' Identifier
    |BLOCK 
    |NOBLOCK
    |BYTE 
    |MESSAGE
    |EOFCONNECT
    |HOTLINK
    |IGNOREDOSEOF
    |LRECL '=' Identifier
    |NOTAB
    |RECFM '=' ('('F|N|P|S370V|S370VB|S370VBS|V|D|FB|VB|U|A|M|S|N')')
    |RETRY '=' Identifier
    |SERVER 
    |CLIENT
    |TERMSTR '=' ('('CRLF|LF|CR')')
    |CCHHR '=' Identifier
    |CLOSE '=' ('('REREAD|LEAVE|REWIND|FREE|DISP')')
    |CSRC
    |DCB '=' Identifier
    |LINESIZE '=' Identifier
;

