package compiler;

public enum Operator {
	//adding another operator is done by adding it to this list
	OP_NOT(1,"not","!") {
		@Override
		protected String doOperation(Datatype[] pOperands) {
			// TODO Auto-generated method stub
			return null;
		}
	},
	OP_OR(2,"or","||") {
		@Override
		protected String doOperation(Datatype[] pOperands) {
			//TODO generate label from scope/somewhere
			//TODO instead of ldc 0/1 use Datatype.TYPE_BOOLEAN.TRUE / FALSE or something equivalent
			String instructions="";
			instructions += "ior";					//Bitweise and of two integers on the stack
			instructions += "ifgt "+"success"+"\n"; //Result > 0
			instructions += "ldc 0"+"\n";
			instructions += "goto "+"op_end"+"\n";
			instructions += "success:"+"\n";
			instructions += "ldc 1"+"\n";
			instructions += "op_end"+"\n";
			return instructions;
		}
	},
	OP_AND(2,"and","&&") {
		@Override
		protected String doOperation(Datatype[] pOperands) {		  
			//TODO generate label from scope/somewhere
			//TODO instead of ldc 0/1 use Datatype.TYPE_BOOLEAN.TRUE / FALSE or something equivalent
			String instructions="";
			instructions += "iand";					//Bitweise and of two integers on the stack
			instructions += "ifgt "+"success"+"\n"; //Result > 0
			instructions += "ldc 0"+"\n";
			instructions += "goto "+"op_end"+"\n";
			instructions += "success:"+"\n";
			instructions += "ldc 1"+"\n";
			instructions += "op_end"+"\n";
			return instructions;
		}
	},
	OP_LE(2,"lower equal","<=") {
		@Override
		protected String doOperation(Datatype[] pOperands) {
			  
			//TODO generate label from scope/somewhere
			//TODO instead of ldc 0/1 use Datatype.TYPE_BOOLEAN.TRUE / FALSE or something equivalent
			String instructions="";
			instructions += "if_icmple "+"success"+"\n";
			instructions += "ldc 0"+"\n";
			instructions += "goto "+"op_end"+"\n";
			instructions += "success:"+"\n";
			instructions += "ldc 1"+"\n";
			instructions += "op_end"+"\n";
			return instructions;
		}
	},
	OP_LT(2,"lower","<") {
		@Override
		protected String doOperation(Datatype[] pOperands) {
			//TODO generate label from scope/somewhere
			//TODO instead of ldc 0/1 use Datatype.TYPE_BOOLEAN.TRUE / FALSE or something equivalent
			String instructions="";
			instructions += "if_icmplt "+"success"+"\n";
			instructions += "ldc 0"+"\n";
			instructions += "goto "+"op_end"+"\n";
			instructions += "success:"+"\n";
			instructions += "ldc 1"+"\n";
			instructions += "op_end"+"\n";
			return instructions;
		}
	},
	OP_GE(2,"greater equal",">=") {
		@Override
		protected String doOperation(Datatype[] pOperands) {
			//TODO generate label from scope/somewhere
			//TODO instead of ldc 0/1 use Datatype.TYPE_BOOLEAN.TRUE / FALSE or something equivalent
			String instructions="";
			instructions += "if_icmpge "+"success"+"\n";
			instructions += "ldc 0"+"\n";
			instructions += "goto "+"op_end"+"\n";
			instructions += "success:"+"\n";
			instructions += "ldc 1"+"\n";
			instructions += "op_end"+"\n";
			return instructions;
		}
	},
	OP_GT(2,"greater",">") {
		@Override
		protected String doOperation(Datatype[] pOperands) {
			//TODO generate label from scope/somewhere
			//TODO instead of ldc 0/1 use Datatype.TYPE_BOOLEAN.TRUE / FALSE or something equivalent
			String instructions="";
			instructions += "if_icmpgt "+"success"+"\n";
			instructions += "ldc 0"+"\n";
			instructions += "goto "+"op_end"+"\n";
			instructions += "success:"+"\n";
			instructions += "ldc 1"+"\n";
			instructions += "op_end"+"\n";
			return instructions;
		}
	},
	OP_EQ(2,"equal","==") {
		@Override
		protected String doOperation(Datatype[] pOperands) {
			String instructions = "";
			instructions += "if_icmpeq "+"success"+"\n";
			instructions += "ldc 0"+"\n";
			instructions += "goto "+"op_end"+"\n";
			instructions += "success:"+"\n";
			instructions += "ldc 1"+"\n";
			instructions += "op_end"+"\n";
			return instructions;
		}
	},
	OP_NEQ(2,"notequal","!=") {
		@Override
		protected String doOperation(Datatype[] pOperands) {
			String instructions = "";
			instructions += "if_icmpneq "+"success"+"\n";
			instructions += "ldc 0"+"\n";
			instructions += "goto "+"op_end"+"\n";
			instructions += "success:"+"\n";
			instructions += "ldc 1"+"\n";
			instructions += "op_end"+"\n";
			return instructions;
		}
	};
	
	public class OperandException extends Exception {
		private static final long serialVersionUID = 766177523204367548L;
		
		public OperandException(String pMsg){
			super(pMsg);
		}
	}
	
	
	//maybe adding of the following could be useful for compilation:
	//returntype as a datatype
	//datatypes of the operands
	//this would make it possible to cast operands/return values to the needed types
	private int arity;
	private String name;
	private String toolOp;
	
	private Operator(){
		this.arity = 0;
		this.name = "";
		this.toolOp ="";
	}
	
	private Operator(int pArity, String pName, String pToolOp ){
		this.arity = pArity;
		this.name = pName;
		this.toolOp = pToolOp;
	}
	
	public String getToolOperator(){
		return this.toolOp;
	}
	
	public static Operator resolveOperator(String pText){
		Operator op = null;
		for(Operator toTest : Operator.class.getEnumConstants()){
			if(toTest.getToolOperator().equals(pText)){
				op = toTest;
				break;
			}
		}
		return op;
	}
	
	//pOperands can be used to convert operands to matching datatypes
	public String compileOperator(Datatype[] pOperands) throws OperandException{
		if(pOperands.length == this.arity){
			return this.doOperation(pOperands);
		}
		else {
			throw new OperandException("wrong amount of operands for: "+this.name+", needed: "+this.arity+", found: "+pOperands.length);
		}
	}

	protected abstract String doOperation(Datatype[] pOperands);
	
}
