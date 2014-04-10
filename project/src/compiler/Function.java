package compiler;

import generated.ToolParser;

import java.util.LinkedList;


public class Function {
	String name;
	Datatype returnType;
	LinkedList<String> paramNames;
	LinkedList<Datatype> paramTypes;
	
	public Function()
	{
		this.returnType = Datatype.TYPE_INVALID;
		this.paramNames = null;
		this.paramTypes = null;
	}
	
	public Function(String name, Datatype type, LinkedList<String> pNames, LinkedList<Datatype> pTypes)
	{
		this.name = name;
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
	
	public String createFunctionStatement(String code)
	{
		String returnString = ".method "+ this.name+ this.getDescriptor()+System.lineSeparator() ;
		returnString += code;
		returnString+= ".endmethod"+System.lineSeparator() ;
		return returnString;
	}

}
