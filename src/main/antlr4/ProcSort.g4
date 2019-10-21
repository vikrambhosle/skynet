grammar ProcSort;
import CommonGrammar, ByStmt ;
sort_main
 : (proc_sort)* EOF
 ;
proc_sort
: PROC SORT  collating_seq_opt other_opt*';'
  by_stmt
  key_stmt?
;

collating_seq_opt
 :  DATA '=' Identifier
 ;

other_opt
 :  DATA '=' Identifier
 ;

key_stmt :
KEY variables
;

