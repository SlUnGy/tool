package compiler;

public class Variable {	
	private Integer id;
	private Datatype type;
	private boolean global;
	
	public Variable(Integer pId, Datatype pType, boolean pIsGlobal){
		this.id = pId;
		this.type = pType;
		this.global = pIsGlobal;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Datatype getType() {
		return this.type;
	}

	public void setType(Datatype type) {
		this.type = type;
	}
	
	public boolean isGlobalVariable(){
		return this.global;
	}
}
