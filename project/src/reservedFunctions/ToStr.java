package reservedFunctions;

import compiler.Datatype;
import compiler.Stack;

public class ToStr implements ReservedFunction {

	@Override
	public String getJasmineStatements(String arguments , Stack currentStack, int line) {
		executeStackOperations(currentStack, arguments, line);
		return "invokestatic java/lang/Integer/toString(I)Ljava/lang/String;";
	}

	@Override
	public void executeStackOperations(Stack currentStack, String arguments,
			int line) {
		currentStack.pop(Datatype.TYPE_INT, line);
		currentStack.push(Datatype.TYPE_STRING);
	}

}
