package Conditions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx {
	public static void main(String args[]) {
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		map.put(1, 1234);
		map.put(2, 2345);
		map.put(2, 3456);
		map.put(4, 4567);
		map.put(5, 5678);
		
		 for(Map.Entry ssn:map.entrySet()){  
			   System.out.println(ssn.getKey()+" "+ssn.getValue());  		
		
	}
	}
}
