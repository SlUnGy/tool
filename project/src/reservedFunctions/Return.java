package reservedFunctions;
import compiler.Datatype;
import compiler.Stack;

public class Return implements ReservedFunction {

	@Override
	public String getJasmineStatements(String arguments, Stack currentStack, int line) {
		
			String returnString=null;

			switch(currentStack.getLastStackEntry())
			{
				case TYPE_INT:
				case TYPE_BOOL:
					returnString = "ireturn";
				break;
				case TYPE_STRING:
					returnString = "areturn";
				break;		
				case TYPE_OBJECT:
					returnString = "areturn";
				break;
			default:
				returnString = "return";
				break;
			}
			
			executeStackOperations(currentStack, arguments, line);
			return returnString;

	}

	@Override
	public void executeStackOperations(Stack currentStack, String arguments, int line) {
		
		switch(arguments.substring(0, 0))
		{
			case "I":
				currentStack.pop(Datatype.TYPE_INT, line);
			break;
			case "L":
				currentStack.pop(Datatype.TYPE_STRING, line);
			break;				
		}
	}

}
