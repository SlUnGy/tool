package compiler;

public enum Datatype {
	TYPE_INT, TYPE_BOOL, TYPE_STRING, TYPE_VOID, TYPE_INVALID;
	
	public class UnknownDatatypeException extends Exception {
		private static final long serialVersionUID = -4205430090266872053L;

		public UnknownDatatypeException(String pMsg) {
			super(pMsg);
		}

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
}
