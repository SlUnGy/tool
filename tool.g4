grammar tool;

start: def* main def*;

main: MAIN '(' ')' '{' code* '}';

def: var_def ';'
	| func_def;

code: var_def ';'
	| assignment ';'
	| func_call ';'
	| cont_structure;

cont_structure: IF '(' bool_expression ')' '{' code+ '}' ( ELSEIF '(' bool_expression ')' '{' code+ '}' )* ( ELSE '{' code+ '}' )?;

assignment: NAME '=' expression;

expression: int_expression 
	| bool_expression;

int_expression: produkt (('+' | '-') produkt)*;

produkt: int_faktor (('*' | '/') int_faktor)*;

int_faktor: '(' int_expression ')'
	| func_call
	| NAME
	| NUMBER;
	
bool_expression: bool_faktor (('<' | '>' | '<=' | '>=' | '==' | '!=' | '||' | '&&') bool_faktor)*;

bool_faktor: '(' bool_expression ')'
		| '!' bool_expression
		| func_call
		| int_expression
		| NAME
		| BOOLEAN;

var_def: data_type ( NAME | assignment );

data_type: TYPE_INT | TYPE_BOOL;

func_def: DEFINE data_type NAME '(' (parameter (',' parameter)*)? ')' '{' code* '}';

func_call: NAME '(' ( expression (',' expression)* )?  ')';

parameter: data_type NAME;


MAIN: '_haupt';

IF: '_wenn';
ELSEIF: '_oder_dies';
ELSE: '_sonst';

DEFINE: 'definiere';

TYPE_INT: 'int';
TYPE_BOOL: 'bool';

NAME: [a-zA-Z]+ ;
BOOLEAN: '_true' | '_false' ;
NUMBER: [1-9][0-9]* | '0';

WS: [ \r\t\n]+ -> skip;
