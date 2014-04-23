package reservedFunctions;
import compiler.Stack;

public interface ReservedFunction {
	
	public String getJasmineStatements(String arguments, Stack currentStack, int line);
	
	public void executeStackOperations(Stack currentStack, String arguments, int line);

}
