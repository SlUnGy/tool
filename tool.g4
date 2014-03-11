grammar tool;

start: def* main def*;

main: MAIN L_PAREN R_PAREN L_C_BRACE code* R_C_BRACE;

def: var_def SEMICOLON 
	| func_def 
	;

code: var_def SEMICOLON
	| assignment SEMICOLON
	| func_call SEMICOLON
	| contr_structure;

contr_structure: IF L_PAREN bool_expression R_PAREN L_C_BRACE code+ R_C_BRACE ( ELSEIF L_PAREN bool_expression R_PAREN L_C_BRACE code+ R_C_BRACE )* ( ELSE L_C_BRACE code+ R_C_BRACE )? #if
		| DO_WHILE L_C_BRACE code+ R_C_BRACE L_PAREN bool_expression R_PAREN SEMICOLON #do_while
		| WHILE L_PAREN bool_expression R_PAREN L_C_BRACE code+ R_C_BRACE #while
		;

assignment: NAME ASSIGN_TO expression;

expression: var_name
	| func_call
	| int_expression 
	| str_expression
	| bool_expression;

var_name: NAME;

int_expression: produkt ( ('+' | '-') produkt)*;

produkt: int_faktor ( ('*' | '/') int_faktor)*;

int_faktor: L_PAREN int_expression R_PAREN
| func_call
	| var_name
	| NUMBER;
	
bool_expression: bool_faktor ( ('<' | '>' | '<=' | '>=' | '==' | '!=' | '||' | '&&') bool_faktor)*;

bool_faktor: L_PAREN bool_expression R_PAREN
		| INVERT bool_expression
		| func_call
		| int_expression
		| str_expression
		| var_name
		| BOOLEAN;

str_expression: str_faktor ( CAT str_faktor)*;

str_faktor: L_PAREN str_expression R_PAREN
		| func_call
		| STRING;

var_def: data_type ( NAME | assignment );

data_type: TYPE_INT | TYPE_BOOL | TYPE_STRING;

func_def: DEFINE ( data_type | TYPE_VOID ) NAME L_PAREN (parameter ( COMMA parameter)* )? R_PAREN L_C_BRACE code* R_C_BRACE ;

func_call: NAME L_PAREN ( expression ( COMMA  expression)* )?  R_PAREN ;

parameter: data_type NAME;


L_PAREN: '(';
R_PAREN: ')';
R_C_BRACE: '}';
L_C_BRACE: '{';
SEMICOLON: ';';
COMMA: ',';
ASSIGN_TO: '=';
CAT: '+';

INVERT: '!';

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
