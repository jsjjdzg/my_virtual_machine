grammar  ArrayInit;

prog: stat+;
stat: expr NEWLINE  # printExpr
|ID '=' expr NEWLINE     # assign
|NEWLINE            # blank
;

expr: expr op=(MUL|DIV) expr   #MulDiv
|     expr op=(SUB|ADD) expr   #AddSub
|     INT                   #int
|     ID                    #id
|     '(' expr ')'          #parens
;

ID: [a-zA-Z];
INT: [0-9]+;
NEWLINE: '\n';
WS: [\t]+ -> skip;

ADD:'+';
SUB:'-';
MUL:'*';
DIV:'/';
