grammar MergeStmt;
import CommonGrammar;

merge_main
 : (merge_stmt)* EOF
 ;
merge_stmt
: MERGE dataset_name_opt+  (END '=' Identifier)? ';'
;

dataset_name_opt
 : dataset_name ('(' variables  '=' (~('('|')'))*? ')')?
 ;
dataset_name : Identifier;