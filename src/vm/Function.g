grammar Function;

options{
	output = AST;
	ASTLabelType = CommonTree;
}
tokens{
	FUNCTION; PARAMATERS; PARAM; BLOCK; STMTS; ASSIGN; NOP; EXPR; NUM; VAR; NOT; NEGATE; CALL; 
}

@members {
    private String errMsg = "";
    public void emitErrorMessage(String msg) {
         errMsg =msg;
         throw new SyntaxErrorException(msg);
    }
    public String getErrorMessage(){
    	return errMsg;
    }
}
@lexer::members {
    private String errMsg = "";
    public void emitErrorMessage(String msg) {
         errMsg =msg;
         throw new SyntaxErrorException(msg);
    }
    public String getErrorMessage(){
    	return errMsg;
    }
}

prog: funDecl+ 
; 

funDecl
	:	name=ID '(' paramDeclList ')' act=block -> ^(FUNCTION $name ^(PARAMATERS paramDeclList)? $act)
;

paramDeclList
	:	(paramDecl (',' paramDecl)*)? -> paramDecl*
;

paramDecl
	:	ID -> ^(PARAM ID)	
;

block	
	:	'{' stmts=stmtList '}' -> ^(BLOCK ^(STMTS $stmts))
;

stmtList:	stmt*
;

stmt
    :  
	  RETURN expr ';' -> ^(RETURN expr)
	| ifStmt 
	| WHILE '(' expr ')' stmt -> ^(WHILE expr stmt)
	| 'do' stmt WHILE '(' expr ')'  -> stmt ^(WHILE expr stmt)
	| 'for' '(' ini=expr ';' tes=expr ';' inc=expr ')' stmt -> $ini ^(WHILE $tes ^(BLOCK ^(STMTS stmt $inc)))
	| block
    | expr ';' -> expr
;

ifStmt	
options{
	backtrack=true;
}
:	
	  IF '(' expr ')' c1=stmt 'else' c2=stmt -> ^(IF expr $c1 $c2)	
	| 'unless' '(' expr ')' c1=stmt 'else' c2=stmt -> ^(IF expr $c2 $c1)
	| IF '(' expr ')' c1=stmt -> ^(IF expr $c1 NOP)
	| 'unless' '(' expr ')' c1=stmt -> ^(IF expr NOP $c1)

; 

expr
options{
	backtrack=true;
}
: 
      ID '=' expr -> ^(ASSIGN ID expr)				
	| orExpr
;

orExpr	:	andExpr ('||'^ andExpr)*
;

andExpr	:	equalityExpr ('&&'^ equalityExpr)*
;

equalityExpr
	:	comparisonExpr (('=='|'!=')^ comparisonExpr)*
;

comparisonExpr 
	:	additiveExpr (('>'|'<'|'<='|'>=')^ additiveExpr)*  
;

additiveExpr 
	:	multExpr (('+' |'-' )^ multExpr )* 
;	

multExpr 
	:   notExpr (('*' |'/' )^ notExpr )*  
;

notExpr
	:	(op='!')? negationExpr 	-> {$op != null}? ^(NOT negationExpr)
						        -> negationExpr
;

negationExpr
	:	(op='-')? primary 	-> {$op != null}? ^(NEGATE primary)
					-> primary
;
primary 
	:   atom  			
	|  '(' expr ')' -> expr  
;

atom 
options{
	backtrack=true;
}	:
	  NUMBER  -> ^(NUM NUMBER)    
	| ID '(' exprList ')' -> ^(CALL ID exprList)    
	| ID -> ^(VAR ID)
	
;

exprList:	(expr (',' expr)*)? ->  expr*
;

IF : 'if' ;
WHILE : 'while' ;
RETURN : 'return' ;
ID : ('a'..'z' |'A'..'Z' )('a'..'z' |'A'..'Z'|'0'..'9')* ;
NUMBER : ('0'..'9')+ ('.' ('0'..'9')+)? ;
NEWLINE:'\r' ? '\n' {skip();} ;
WS : (' ' |'\t' |'\n' |'\r' )+ {skip();} ;

