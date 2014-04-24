package reservedFunctions;

import compiler.Datatype;
import compiler.Stack;

public class ToStr extends ReservedFunctions {
	
	public ToStr() {
		this.returnType = Datatype.TYPE_STRING;
	}

	@Override
	public String getJasmineStatements(String arguments , Stack currentStack, int line) {
		executeStackOperations(currentStack, arguments, line);
		return "invokestatic java/lang/Integer/toString(I)Ljava/lang/String;";
	}

	@Override
	public void executeStackOperations(Stack currentStack, String arguments,
			int line) {
		
		if(currentStack.getLastStackEntry() == Datatype.TYPE_INT)
		{
			currentStack.pop(Datatype.TYPE_INT, line);
		}
		else
		{
			currentStack.pop(Datatype.TYPE_BOOL, line);
		}
		
		currentStack.push(Datatype.TYPE_STRING);
	}

}
