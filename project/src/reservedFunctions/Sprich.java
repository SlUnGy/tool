package reservedFunctions;

import compiler.Datatype;
import compiler.Stack;

public class Sprich extends ReservedFunctions {
	
	public Sprich()
	{
		this.returnType = Datatype.TYPE_VOID;
	}


	@Override
	public String getJasmineStatements(String arguments, Stack currentStack, int line) {
		executeStackOperations(currentStack, arguments, line);
		return "getstatic java/lang/System/out Ljava/io/PrintStream;\n"+ "swap\n" + System.lineSeparator() + "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V";
	}

	@Override
	public void executeStackOperations(Stack currentStack, String arguments,
			int line) {
		
		currentStack.push(Datatype.TYPE_OBJECT);
		currentStack.swap(line);
		currentStack.pop(Datatype.TYPE_STRING, line);
		currentStack.pop(Datatype.TYPE_OBJECT, line);

	}

}
