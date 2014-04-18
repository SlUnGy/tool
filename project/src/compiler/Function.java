package compiler;

import java.util.LinkedList;


public class Function {
	private String name;
	private Datatype returnType;
	private LinkedList<String> paramNames;
	private LinkedList<Datatype> paramTypes;
	
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
	
	public Datatype getReturnType(){
		return this.returnType;
	}
	
	public Datatype getParameterType(int index)
	{
		return paramTypes.get(index);
	}
	
	public String getDescriptor(){
		String descriptor = "(";
		for(Datatype s : paramTypes){
			descriptor += s.getJasminType();
		}
		return descriptor+")"+returnType.getJasminType();
	}
	
	public String createFunctionStatement(String code, int numberLocalVars, int stackSize)
	{
		String returnString = ".method "+ this.name + this.getDescriptor()+System.lineSeparator() ;
		returnString += ".limit locals "+numberLocalVars + "\n";
		returnString += ".limit stack "+stackSize + "\n";
		returnString += code;
		returnString+= ".end method"+System.lineSeparator() ;
		return returnString;
	}

}
