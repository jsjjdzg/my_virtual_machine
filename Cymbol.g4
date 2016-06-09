grammar Cymbol;

prog:   funDecl+//函数
;

funDecl
    :   funName=ID '('parameterList')' funBlock=block
    ;

parameterList
    :   (parameter(',' parameter)*)?
    ;

parameter
    :   ID
    ;

block:  '{' stmtList '}' ;   // possibly empty statement block

stmtList
    :   stmt*
    ;

stmt
    : RETURN expr ';'
	| ifStmt
    | expr ';'
    //	| WHILE '(' expr ')' stmt
    //	| 'do' stmt WHILE '(' expr ')'
    //	| 'for' '(' ini=expr ';' tes=expr ';' inc=expr ')'
    //	| block
    ;

ifStmt
    : IF '(' expr ')' case1=stmt 'else' case2=stmt
	| IF '(' expr ')' case1=stmt
;
expr
    :   ID '=' expr             #Assign
    |   ID '(' exprList ')'    # Call
//    |   expr '[' expr ']'       # Index
    |   op=NEG expr                # Negate
    |   op=NOT expr                # Not
    |   expr op=(MUL|DIV) expr           # MulDiv
    |   expr op=(ADD|SUB) expr     # AddSub
    |   expr op='==' expr          # Equal
    |   ID                      # Var
    |   NUMBER                     # Number
    ;

exprList : (expr (',' expr)*)? ;   // arg list


MUL:'*';
DIV:'/';
ADD:'+';
SUB:'-';
NEG:'-';
NOT:'!';
IF : 'if' ;
RETURN : 'return' ;

ID  :  ('a'..'z' |'A'..'Z' )('a'..'z' |'A'..'Z'|'0'..'9')* ;
NUMBER :   [0-9]+ ;
WS  :   [ \t\n\r]+ -> skip ;
SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;
