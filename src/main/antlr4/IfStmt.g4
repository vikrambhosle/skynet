grammar IfStmt;
import CommonGrammar;
if_stmt_main
 : (if_stmt)* EOF
 ;
if_stmt
 : IF expression ';'
 ;