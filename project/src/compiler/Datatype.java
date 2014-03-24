package compiler;

public enum Datatype {
	TYPE_INT("I"), TYPE_BOOL("Z"), TYPE_STRING("Ljava/lang/String;"), TYPE_VOID("V"), TYPE_INVALID("Ö");

	private String jasminType;
	
	private Datatype(){
		this.jasminType="";
	}
	
	private Datatype(String pType){
		this.jasminType = pType;
	}
	
	public static Datatype resolveType(String pString){
		Datatype type = null;
		switch(pString){
		case "int":
			type=TYPE_INT;
			break;
		case "bool":
			type=TYPE_BOOL;
			break;
		case "str":
			type=TYPE_STRING;
			break;
		case "leer":
			type=TYPE_VOID;
			break;
		default:
			type=TYPE_INVALID;
			break;
		}
		return type;
	}

	public String getJasminType() {
		return this.jasminType;
	}
}
