package compiler;


public class Function {
	
	Scope scope;
	String name;
	Datatype type;
	
	
	public Function(String name, Datatype type, Scope parentScop)
	{
		this.name = name;
		this.type = type;
		this.scope = new Scope(parentScop);
	}
	
	public void addVariable()
	{
		
	}
	

}
