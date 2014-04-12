package compiler;

import java.util.HashMap;
import java.util.Map;

public class LabelCounter {
	private static Map<String, Integer> counter;

	static {
		counter = new HashMap<>();
	}
	
	protected static Integer increaseCount(String pName){
		Integer newCount = 0;
		if(counter.containsKey(pName)){
			newCount = counter.get(pName)+1;
		}
		counter.put(pName, newCount);
		return newCount;
	}
	
	public static String createSafeName(String pName){
		return pName+increaseCount(pName);
	}
	
	private LabelCounter(){
		
	}
}
