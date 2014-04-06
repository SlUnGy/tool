package compiler;

public enum Datatype {
	TYPE_INT("I","Integer"),
	TYPE_BOOL("Z","Boolean"),
	TYPE_STRING("Ljava/lang/String;","String"),
	TYPE_VOID("V","Void/Object"),
	TYPE_INVALID("Ö","INVALID");

	private String jasminType;
	private String naturalType;
	
	private Datatype(){
		this.jasminType="";
		this.naturalType="";
	}
	
	private Datatype(String pType, String pNatural){
		this.jasminType = pType;
		this.naturalType = pNatural;
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
			System.err.println("not able to resolve type from '"+pString+"'");
			System.exit(-1);
			break;
		}
		return type;
	}

	public String getJasminType() {
		return this.jasminType;
	}
	
	public String getType(){
		return this.naturalType;
	}
	
	public static String compare(String pLeft, String pOperator, String pRight){
		return "true";
	}
}
