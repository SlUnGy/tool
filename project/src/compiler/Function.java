package compiler;

import java.util.LinkedList;

public class Function {
	private String name;
	protected Datatype returnType;
	private LinkedList<String> paramNames;
	private LinkedList<Datatype> paramTypes;
	private String invocation = null;

	public Function() {
		this.returnType = Datatype.TYPE_INVALID;
		this.paramNames = null;
		this.paramTypes = null;
	}

	public Function(String name, Datatype type, LinkedList<String> pNames, LinkedList<Datatype> pTypes) {
		this.name = name;
		this.returnType = type;
		this.paramNames = pNames;
		this.paramTypes = pTypes;
	}

	public Function(String name, String invocation, Datatype type) {
		this.name = name;
		this.invocation = invocation;
		this.returnType = type;
	}

	public Datatype getReturnType() {
		return this.returnType;
	}

	public void popParameters(Stack currentStack, int line) {

		for (Datatype type : paramTypes) {
			currentStack.pop(type, line);
		}

	}

	public String getInvocation() {
		return this.invocation;
	}

	public Datatype getParameterType(int index) {
		return paramTypes.get(index);
	}

	public String getDescriptor() {
		String descriptor = "(";
		for (Datatype s : paramTypes) {
			descriptor += s.getJasminType();
		}
		return descriptor + ")" + returnType.getJasminType();
	}

	public String createFunctionStatement(String code, Scope pScope, Stack pStack) {
		final String funLabelStart = LabelCounter.createSafeName("m_" + this.name + "_s");
		final String funLabelEnd = LabelCounter.createSafeName("m_" + this.name + "_e");
		final int localVarSize = pScope.getLocalSize();
		final int localStackSize = pStack.getMaxStackSize();

		String returnString = ".method public static " + this.name + this.getDescriptor() + System.lineSeparator();
		returnString += ".limit stack " + localStackSize + System.lineSeparator();
		returnString += ".limit locals " + localVarSize + System.lineSeparator();
		returnString += pScope.createVarDebugStatements(funLabelStart, funLabelEnd);
		returnString += funLabelStart + ":" + System.lineSeparator();
		returnString += code;
		if (!code.contains("return")) {
			returnString += "return" + System.lineSeparator();
		}
		returnString += funLabelEnd + ":" + System.lineSeparator();
		returnString += ".end method" + System.lineSeparator();
		
		return returnString;
	}

}
