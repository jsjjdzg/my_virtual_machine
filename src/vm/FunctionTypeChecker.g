tree grammar FunctionTypeChecker;

options{
	tokenVocab=Function;  
	ASTLabelType=CommonTree;
	output = template;	
}

@header {
	import java.util.Map;
	import java.util.HashMap;
}

@members{
	private static final String bool = "bool";
	private static final String number = "number";
	private Map<String, String> symbolTable = new HashMap<String, String>();
	
	private void checkType(String expected, String actual, String context){
		if(!expected.equals(actual)) throw new TypeErrorException(expected, actual, context);
	}
}

prog: funDecl+; 

funDecl
	: ^(FUNCTION ID parmeters block) 
;

parmeters: 
   | ^(PARAMATERS paramDeclList)
;

paramDeclList
	:	paramDecl*
;

paramDecl
	:	^(PARAM p=ID) {symbolTable.put(p.getText(), number);}				
;

block	
	:	^(BLOCK ^(STMTS stmtList))
;

stmtList :	stmt*
;

stmt :  
		  ^(RETURN expr) 
		| ifStmt
		| whileStmt
		| block
		| expr
; 
whileStmt
:
	^(WHILE e=expr {checkType(bool, e.clazz, $text);} 
	  stmt) 
;
ifStmt	
:	
     
	  ^(IF e=expr {checkType(bool, e.clazz, $text);} 
	    (stmt)  
	    (stmt|NOP)) 
; 
	
	
expr returns[String clazz]
: 
      ^(ASSIGN v=ID e=expr)  {symbolTable.put(v.getText(), e.clazz); $clazz=e.clazz;}				
    | ^(t=('||'|'&&') e1=expr e2=expr) {checkType(bool, e1.clazz, $text); checkType(bool, e2.clazz, $text); $clazz = bool;}
    | ^(t=('=='|'!='|'>'|'>='|'<'|'<=') e1=expr e2=expr) {checkType(number, e1.clazz, $text); checkType(number, e2.clazz, $text); $clazz = bool;}
    | ^(t=('+'|'-'|'*'|'/') e1=expr e2=expr) {checkType(number, e1.clazz, $text); checkType(number, e2.clazz, $text); $clazz = number;}
	| ^(NOT e=expr) {checkType(bool, e.clazz, $text); $clazz = bool;}
	| ^(NEGATE e=expr) {checkType(number, e.clazz, $text); $clazz = number;}			
	| a=atom {$clazz=a.clazz;}
;

atom returns[String clazz]
:
	   ^(NUM NUMBER)   {$clazz = number;} 
	|  ^(CALL ID exprList)    {$clazz = number;} 
	|  ^(VAR v=ID)	{$clazz=symbolTable.get(v.getText()); if(null==$clazz){$clazz = number;} }
;

exprList 
:	expr*
;