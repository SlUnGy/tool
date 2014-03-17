grammar Tool;

start: befDef=def* main aftDef=def*#program;

main: MAIN L_PAREN R_PAREN L_C_BRACE instructions=code* R_C_BRACE#main_func;

def: variableDef=var_def SEMICOLON
	| functionDef=func_def
	;

code: var_def SEMICOLON 
	| assignment SEMICOLON
	| func_call SEMICOLON
	| contr_structure
	;

contr_structure: IF L_PAREN if_condition=bool_expr R_PAREN L_C_BRACE if_instructions=code+ R_C_BRACE ( ELSEIF L_PAREN elif_condigion=bool_expr R_PAREN L_C_BRACE elif_instructions=code+ R_C_BRACE )* ( ELSE L_C_BRACE else_instructions=code+ R_C_BRACE )? #if
		| DO_WHILE L_C_BRACE instructions=code+ R_C_BRACE L_PAREN condition=bool_expr R_PAREN SEMICOLON #do_while
		| WHILE L_PAREN condition=bool_expr R_PAREN L_C_BRACE instructions=code+ R_C_BRACE #while
		;

assignment: variableName=NAME ASSIGN_TO value=expr #assign_to;

expr: var_name
	| func_call
	| int_expr 
	| str_expr
	| bool_expr;

var_name: NAME;

int_expr: left=produkt ( operator=('+' | '-') val=produkt)*;

produkt: left=int_faktor ( operator=('*' | '/') val=int_faktor)*;

int_faktor: L_PAREN int_expr R_PAREN
	| func_call
	| var_name
	| NUMBER;
	
bool_expr: left=bool_faktor ( operator=('<' | '>' | '<=' | '>=' | '==' | '!=' | '||' | '&&') val=bool_faktor)*;


bool_faktor: L_PAREN bool_expr R_PAREN
		| INVERT bool_expr
		| func_call
		| int_expr
		| str_expr
		| var_name
		| BOOLEAN;

str_expr: left=str_faktor ( CAT str_faktor)*;

str_faktor: L_PAREN str_expr R_PAREN
		| func_call
		| STRING;

var_def: type=var_data_type  variableName=NAME (ASSIGN_TO value=expr)?; 

var_data_type: type=TYPE_INT 
		| type=TYPE_BOOL 
		| type=TYPE_STRING;

func_data_type: type=TYPE_INT 
		| type=TYPE_BOOL 
		| type=TYPE_STRING
		| type=TYPE_VOID;

func_def: DEFINE type=func_data_type fn_name=NAME L_PAREN parameter_list=func_def_params? R_PAREN L_C_BRACE instructions=code* R_C_BRACE ;

func_def_params: parameter ( COMMA parameter )*;

func_call: fn_name=NAME L_PAREN parameters=func_call_params?  R_PAREN ;

func_call_params: expr ( COMMA expr )*;

parameter: type=var_data_type name=NAME;


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
