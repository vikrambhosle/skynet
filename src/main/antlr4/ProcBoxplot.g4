grammar ProcBoxplot;

import CommonGrammar ;
// import CommonLexerRules, CommonParserRules;
// options {tokenVocab=CommonLexerRules;}

boxplot_main
 : (boxplot_stmt)* EOF
 ;
boxplot_stmt
: PROC BOXPLOT boxplot_options ';'
boxplot_stmt_list+
;

boxplot_stmt_list
:BY  Identifier* ';'
|ID Identifier* ';'
|INSET  keywords* inset_options* ';'
|INSETGROUP keywords* insetgroup_options* ';'
|PLOT '('* Identifier* ')'* '*' Identifier';'
;

boxplot_options
: ANNOTATE '=' Identifier
| ANNO '=' Identifier
| BOX '=' Identifier
| DATA '=' Identifier
| HISTORY '=' Identifier
| HIST '=' Identifier
;

inset_options
: CTEXT'=' Identifier
| CFILL'=' Identifier
| POSITION'=' Identifier
| HEADER'=' STRINGLITERAL
;

insetgroup_options 
: CTEXT'=' Identifier
| CFILL'=' Identifier
| POSITION'=' Identifier
| HEADER'=' STRINGLITERAL
;

keywords
: DATA '=' Identifier
| MEAN
| MIN
| MAX
| NMIN
| NMAX
| NOBS
| STDDEV
;