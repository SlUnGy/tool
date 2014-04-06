package compiler;

import java.util.LinkedList;


public class Function {
	Datatype returnType;
	LinkedList<String> paramNames;
	LinkedList<Datatype> paramTypes;
	
	public Function()
	{
		this.returnType = Datatype.TYPE_INVALID;
		this.paramNames = null;
		this.paramTypes = null;
	}
	
	public Function( Datatype type, LinkedList<String> pNames, LinkedList<Datatype> pTypes)
	{
		this.returnType = type;
		this.paramNames = pNames;
		this.paramTypes = pTypes;
	}
	
	public String getDescriptor(){
		String descriptor = "(";
		for(Datatype s : paramTypes){
			descriptor += s.getJasminType();
		}
		return descriptor+")"+returnType.getJasminType();
	}

}
