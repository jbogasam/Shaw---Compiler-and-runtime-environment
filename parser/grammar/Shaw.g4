grammar Shaw;


start: '[' block ']'
	 ;


block: '{' blockstmt* '}'
	 ;

blockstmt: funcdeclaration 
		 | localvariabledeclarationstmt
		 | stmt
		 ;
		 
funcdeclaration: 'func' (type | 'void') Identifier '(' argument ')' block
               ;
		 
		 
localvariabledeclarationstmt: type variabledeclarators
							;

variabledeclarators: variabledeclarator(',' variabledeclarator)* 
				   ;
				   
variabledeclarator: variabledeclaratorId('=' variableInitializer)?
				  ;
				  
variabledeclaratorId: Identifier
					;
					
variableInitializer: expression
					;

stmt: block
	| expression
	| 'return' expression?
	| 'while' parexpression stmt
	|'if' parexpression stmt ('else' stmt)?
	;
	 
parexpression: '(' expression ')'
			 ;
			 
expression: expression( '==' | '!=' ) expression
		  | expression( '+' | '-' | '*' | '/' ) expression
		  | expression ('<' | '<=' | '>' | '>=' | '=' ) expression
		  | '(' expression ')'
		  | expression '(' expression ')'
		  | Numval
		  | boolval
		  | Stringval
		  | Identifier
		  ;

type: 'int' 
	| 'bool' 
	| 'String' 
	;

argument: type Identifier (',' argument)* 
		;

Identifier: [a-zA-Z$_][a-zA-Z0-9$_]* 
		  ;


Numval: [0-9]+ 
      ;

boolval: 'true' 
	   | 'false' 
	   ;
	 

Stringval: Identifier 
		 |'"' (Numval | Identifier)* '"' 
		 ;

WHITESPACE: [ \t\n\r]+ -> skip
		  ;