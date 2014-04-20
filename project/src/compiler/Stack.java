package compiler;

import java.util.LinkedList;

public class Stack {
	
	private Stack parent = null;
	private LinkedList<Datatype> Stack =  new LinkedList<Datatype>();
	private int maxStackSize = 0;
	private int stackSize = 0;
	
	public Stack(Stack parent)
	{
		this.parent = parent;
	}
	
	public void push(Datatype datatype)
	{
		if(datatype != Datatype.TYPE_VOID && datatype != Datatype.TYPE_INVALID)
		{
			Stack.add(datatype);
			stackSize++;
			if(stackSize > maxStackSize) maxStackSize++;
		}
	}
	
	public void pop(Datatype datatype, int line)
	{
		try
		{
			if(Stack.getLast() == datatype)
			{
				Stack.removeLast();
				stackSize--;
			}
			else
			{
				System.err.println("Stack missmatch line: "+line+". Found "+Stack.getLast().getType()+ " expected "+ datatype.getType());
				//System.exit(0);
			}
		}
		catch (Exception e)
		{
			
		}
	}
	
	public void popUnchecked()
	{
		try
		{
				Stack.removeLast();
				stackSize--;
		}
		catch (Exception e)
		{
			
		}
	}

	public int getMaxStackSize() {
		
		return this.maxStackSize;
	}

	public Stack getParent() {
		return parent;
	}

}
