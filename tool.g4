grammar tool;

start: def* main def*;

main: MAIN '(' ')' '{' code* '}';

def: var_def ';' 
	| func_def 
	;

code: var_def ';'
	| assignment ';'
	| func_call ';'
	| cont_structure;

cont_structure: IF '(' bool_expression ')' '{' code+ '}' ( ELSEIF '(' bool_expression ')' '{' code+ '}' )* ( ELSE '{' code+ '}' )? #if
		| DO_WHILE '{' code+ '}' '(' bool_expression ')' ';'#do_while
		| WHILE '(' bool_expression ')' '{' code+ '}' #while
		;

assignment: NAME '=' expression;

expression: var_name
	| func_call
	| int_expression 
	| str_expression
	| bool_expression;

var_name: NAME;

int_expression: produkt (('+' | '-') produkt)*;

produkt: int_faktor (('*' | '/') int_faktor)*;

int_faktor: '(' int_expression ')'
	| func_call
	| var_name
	| NUMBER;
	
bool_expression: bool_faktor (('<' | '>' | '<=' | '>=' | '==' | '!=' | '||' | '&&') bool_faktor)*;

bool_faktor: '(' bool_expression ')'
		| '!' bool_expression
		| func_call
		| int_expression
		| str_expression
		| var_name
		| BOOLEAN;

str_expression: str_faktor ('+' str_faktor)*;

str_faktor: '(' str_expression ')'
		| func_call
		| STRING;

var_def: data_type ( NAME | assignment );

data_type: TYPE_INT | TYPE_BOOL | TYPE_STRING;

func_def: DEFINE ( data_type | TYPE_VOID ) NAME '(' (parameter (',' parameter)*)? ')' '{' code* '}';

func_call: NAME '(' ( expression (',' expression)* )?  ')';

parameter: data_type NAME;


MAIN: '_haupt';

IF: '_wenn';
ELSEIF: '_oder_dies';
ELSE: '_sonst';

DO_WHILE: '_solange_bis';
WHILE: '_schleife';

DEFINE: '_definiere';

TYPE_INT: 'int';
TYPE_BOOL: 'bool';
TYPE_STRING: 'str';
/* for functions */
TYPE_VOID: 'leer';

NAME: [a-zA-Z]+;
STRING: '"' .*? '"'; 
BOOLEAN: '_true' | '_false';
NUMBER: [1-9][0-9]* | '0';

COMMENT: '/*' .*? '*/' -> skip;
WS: [ \r\t\n]+ -> skip;
