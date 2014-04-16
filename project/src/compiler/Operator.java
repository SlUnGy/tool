package compiler;

public enum Operator {
	// adding another operator is done by adding it to this list
	// TODO instead of ldc 0/1 use Datatype.TYPE_BOOLEAN.TRUE / FALSE or
	// something equivalent
	OP_NOT("not", "!") {
		@Override
		protected String doOperation() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	OP_OR("or", "||") {
		@Override
		protected String doOperation() {
			final String safeSuccess = LabelCounter.createSafeName("op_success");
			final String safeEnd = LabelCounter.createSafeName("op_end");

			String instructions = "";
			instructions += "ior"; // Bitweise and of two integers on the stack
			instructions += "ifgt " + safeSuccess + "\n"; // Result > 0
			instructions += "ldc 0" + "\n";
			instructions += "goto " + safeEnd + "\n";
			instructions += safeSuccess + ":" + "\n";
			instructions += "ldc 1" + "\n";
			instructions += safeEnd + ":" + "\n";
			return instructions;
		}
	},
	OP_AND("and", "&&") {
		@Override
		protected String doOperation() {
			final String safeSuccess = LabelCounter.createSafeName("op_success");
			final String safeEnd = LabelCounter.createSafeName("op_end");

			String instructions = "";
			instructions += "iand"; // Bitweise and of two integers on the stack
			instructions += "ifgt " + safeSuccess + "\n"; // Result > 0
			instructions += "ldc 0" + "\n";
			instructions += "goto " + safeEnd + "\n";
			instructions += safeSuccess + ":" + "\n";
			instructions += "ldc 1" + "\n";
			instructions += safeEnd + ":" + "\n";
			return instructions;
		}
	},
	OP_LE("lower equal", "<=") {
		@Override
		protected String doOperation() {
			final String safeSuccess = LabelCounter.createSafeName("op_success");
			final String safeEnd = LabelCounter.createSafeName("op_end");

			String instructions = "";
			instructions += "if_icmple " + safeSuccess + "\n";
			instructions += "ldc 0" + "\n";
			instructions += "goto " + safeEnd + "\n";
			instructions += safeSuccess + ":" + "\n";
			instructions += "ldc 1" + "\n";
			instructions += safeEnd + ":" + "\n";
			return instructions;
		}
	},
	OP_LT("lower", "<") {
		@Override
		protected String doOperation() {
			final String safeSuccess = LabelCounter.createSafeName("op_success");
			final String safeEnd = LabelCounter.createSafeName("op_end");

			String instructions = "";
			instructions += "if_icmplt " + safeSuccess + "\n";
			instructions += "ldc 0" + "\n";
			instructions += "goto " + safeEnd + "\n";
			instructions += safeSuccess + ":" + "\n";
			instructions += "ldc 1" + "\n";
			instructions += safeEnd + ":" + "\n";
			return instructions;
		}
	},
	OP_GE("greater equal", ">=") {
		@Override
		protected String doOperation() {
			final String safeSuccess = LabelCounter.createSafeName("op_success");
			final String safeEnd = LabelCounter.createSafeName("op_end");

			String instructions = "";
			instructions += "if_icmpge " + safeSuccess + "\n";
			instructions += "ldc 0" + "\n";
			instructions += "goto " + safeEnd + "\n";
			instructions += safeSuccess + ":" + "\n";
			instructions += "ldc 1" + "\n";
			instructions += safeEnd + ":" + "\n";
			return instructions;
		}
	},
	OP_GT("greater", ">") {
		@Override
		protected String doOperation() {
			final String safeSuccess = LabelCounter.createSafeName("op_success");
			final String safeEnd = LabelCounter.createSafeName("op_end");

			String instructions = "";
			instructions += "if_icmpgt " + safeSuccess + "\n";
			instructions += "ldc 0" + "\n";
			instructions += "goto " + safeEnd + "\n";
			instructions += safeSuccess + ":" + "\n";
			instructions += "ldc 1" + "\n";
			instructions += safeEnd + ":" + "\n";
			return instructions;
		}
	},
	OP_EQ("equal", "==") {
		@Override
		protected String doOperation() {
			final String safeSuccess = LabelCounter.createSafeName("op_success");
			final String safeEnd = LabelCounter.createSafeName("op_end");

			String instructions = "";
			instructions += "if_icmpeq " + safeSuccess + "\n";
			instructions += "ldc 0" + "\n";
			instructions += "goto " + safeEnd + "\n";
			instructions += safeSuccess + ":" + "\n";
			instructions += "ldc 1" + "\n";
			instructions += safeEnd + ":" + "\n";
			return instructions;
		}
	},
	OP_NEQ("notequal", "!=") {
		@Override
		protected String doOperation() {
			final String safeSuccess = LabelCounter.createSafeName("op_success");
			final String safeEnd = LabelCounter.createSafeName("op_end");

			String instructions = "";
			instructions += "if_icmpneq " + safeSuccess + "\n";
			instructions += "ldc 0" + "\n";
			instructions += "goto " + safeEnd + "\n";
			instructions += safeSuccess + ":" + "\n";
			instructions += "ldc 1" + "\n";
			instructions += safeEnd + ":" + "\n";
			return instructions;
		}
	},
	OP_ADD("addition", "+") {
		@Override
		protected String doOperation() {
			return "iadd" + "\n";
		}
	},
	OP_SUB("subtraction", "-") {
		@Override
		protected String doOperation() {
			return "isub" + "\n";
		}
	},
	OP_MUL("multiplication", "*") {
		@Override
		protected String doOperation() {
			return "imul" + "\n";
		}
	},
	OP_DIV("division", "/") {
		@Override
		protected String doOperation() {
			return "idiv" + "\n";
		}
	},
	OP_CAT("concatenation", "+") {
		@Override
		protected String doOperation() {
			return "invokevirtual java/lang/String/concat(Ljava/lang/String;)" + "Ljava/lang/String;" + "\n";
		}
	};

	public class OperandException extends Exception {
		private static final long serialVersionUID = 766177523204367548L;

		public OperandException(String pMsg) {
			super(pMsg);
		}
	}

	private String name;
	private String toolOp;

	private Operator() {
		this.name = "";
		this.toolOp = "";
	}

	private Operator(String pName, String pToolOp) {
		this.name = pName;
		this.toolOp = pToolOp;
	}

	public String getToolOperator() {
		return this.toolOp;
	}

	public static Operator resolveOperator(String pText) {
		Operator op = null;
		for (Operator toTest : Operator.class.getEnumConstants()) {
			if (toTest.getToolOperator().equals(pText)) {
				op = toTest;
				break;
			}
		}
		return op;
	}

	public String compileOperator() throws OperandException {
		return this.doOperation();
	}

	protected abstract String doOperation();
}
