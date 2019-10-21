grammar MergeJoinStmt ;
import ByStmt, IfStmt ,  CommonGrammar;

merge_join_stmt_main
 : (merge_join_stmt)* EOF
 ;
merge_join_stmt
: MERGE ds_name* ';'
  by_stmt
  if_stmt;

ds_name: Identifier opt ;

opt: '(' 'IN' '=' Identifier ')';

///END Identifier was removed from this merge