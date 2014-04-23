package reservedFunctions;
import compiler.Stack;

public interface ReservedFunctionInterface{
	
	public String getJasmineStatements(String arguments, Stack currentStack, int line);
	
	public void executeStackOperations(Stack currentStack, String arguments, int line);

}
