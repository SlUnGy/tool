package compiler;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Scope {
	
	public class UnknownVariableException extends Exception {
		private static final long serialVersionUID = 4379775796175306144L;

		public UnknownVariableException(String pMsg){
			super(pMsg);
		}
	}
	
	public class UnknownFunctionException extends Exception {
		private static final long serialVersionUID = -4601824032925547441L;
		
		public UnknownFunctionException(String pMsg){
			super(pMsg);
		}
	}
	
	private Scope parent;
	private String className;
	private Map<String, Variable> variables;  
	private Map<String, Function> functions;
	
	public Scope(Scope pParent, String pName){
		this.parent = pParent;
		this.variables = new HashMap<>();
		this.functions = new HashMap<>();
		this.className = pName;
	}
	
	public boolean isRoot(){
		return this.parent == null;
	}

	public int defineVar(String pName, Datatype pType){
		if(!this.variables.containsKey(pName)){
			final int next = variables.size();
			variables.put(pName, new Variable(next, pType, this.isRoot()));
			return next;
		}
		else {
			System.err.println("variable redefined in same scope: " + pName);
			return -1;
		}
	}
	
	// only allow happy functions
	public boolean defineFun(String pName, Function pFunc){
		if(!this.functions.containsKey(pName)){
			functions.put(pName, pFunc);
			return true;
		}
		else {
			System.err.println("function redefined in same scope: " +  pName);
			return false;
		}
	}
	
	public Variable getVar(String pName ) throws UnknownVariableException{
		if(variables.containsKey(pName)){
			return variables.get(pName);
		}
		else {
			if(parent != null){
				return parent.getVar(pName);
			}
			else {
				throw new UnknownVariableException("Unknown variable name: "+pName);
			}
		}
		
	}
	
	public Integer getVarId(String pName) throws UnknownVariableException{
		return this.getVar(pName).getId();
	}
	
	public String getVarStoreInstruction(String pName) throws UnknownVariableException {
		final Variable var = this.getVar(pName);
		if(this.isRoot()){
			return "putstatic "+this.className+"/"+pName+" "+var.getType().getJasminType();
		}
		else {
			return var.getType().getStoreInstruction()+" "+var.getId();
		}
	}
	
	public String getVarLoadInstruction(String pName) throws UnknownVariableException {
		final Variable var = this.getVar(pName);
		if(var.isGlobalVariable()){
			return "getstatic "+this.className+"/"+pName+" "+var.getType().getJasminType();
		}
		else {
			return var.getType().getLoadInstruction()+" "+var.getId();
		}
	}
	
	public void printInfo(){
		System.out.println("Info on "+this.toString());
		System.out.println("belonging to class: "+this.className);
		System.out.println("parent:"+this.parent);
		System.out.println("variables:"+this.variables.size());
		for(final Entry<String, Variable> currentEntry : variables.entrySet()){
			final Variable v = currentEntry.getValue();
			System.out.println(" "+currentEntry.getKey()+":"+v.getId()+","+v.getType());
		}
		System.out.println("functions:"+this.functions.size());
		for(final Entry<String,Function> currentEntry : functions.entrySet()){
			final Function f = currentEntry.getValue();
			System.out.println(" "+currentEntry.getKey()+":"+f.getDescriptor());//TODO: print code belonging to function
		}
	}

	public Function getFun(String pName) throws UnknownFunctionException {
		if(functions.containsKey(pName)){
			return functions.get(pName);
		}
		else {
			if(parent != null){
				return parent.getFun(pName);
			}
			else {
				throw new UnknownFunctionException("Unknown function name: "+pName);
			}
		}
	}

	public Scope getParent() {
		return this.parent;
	}
}
