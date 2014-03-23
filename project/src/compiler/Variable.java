package compiler;

public class Variable {	
	private Integer id;
	private Datatype type;
	
	public Variable(Integer pId, Datatype pType){
		this.id = pId;
		this.type = pType;
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
}
