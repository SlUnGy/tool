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
	
	private Scope parent;
	private Map<String, Variable> names;  
	
	public Scope(Scope pParent){
		this.parent = pParent;
		this.names = new HashMap<>();
	}

	public int define(String pName, Datatype pType){
		if(!this.names.containsKey(pName)){
			final int next = names.size();
			names.put(pName, new Variable(next, pType));
			return next;
		}
		else {
			System.out.println("variable "+pName+" redefined in same scope");
		}
		return -1;
	}
	
	public Integer getId(String pName) throws UnknownVariableException{
		if(names.containsKey(pName)){
			return names.get(pName).getId();	
		}
		else {
			if(parent != null){
				return parent.getId(pName);
			}
			else {
				throw new UnknownVariableException("Unknown name: "+pName);
			}
		}
	}
	
	public void printInfo(){
		System.out.println("Info on "+this.toString());
		System.out.println("parent:"+this.parent);
		System.out.println("contents:"+this.names.size());
		for(final Entry<String, Variable> currentEntry : names.entrySet()){
			final Variable v = currentEntry.getValue();
			System.out.println(" "+currentEntry.getKey()+":"+v.getId()+","+v.getType());
		}
	}
}
