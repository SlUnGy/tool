package compiler;

public enum Datatype {
	TYPE_INT("I","Integer","iload","istore"), 
	//TODO: add all the other instructions, jasmin manual doesn't tell you anything though
	TYPE_BOOL("Z","Boolean","notset-load","notset-b-store"),
	TYPE_STRING("Ljava/lang/String;","String","notset-load","notset-store"),
	TYPE_VOID("V","Void/Object","notset-load","notset-store"),
	TYPE_INVALID("Ö","INVALID","notset-load","notset-store");

	private String jasminType;
	private String naturalType;
	private String load;
	private String store;
	
	private Datatype(){
		this.jasminType="";
		this.naturalType="";
		this.load="";
		this.store="";
	}
	
	private Datatype(String pType, String pNatural, String pLoad, String pStore){
		this.jasminType = pType;
		this.naturalType = pNatural;
		this.load = pLoad;
		this.store = pStore;
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
	
	public String getLoadInstruction(){
		return this.load;
	}
	
	public String getStoreInstruction(){
		return this.store;
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
