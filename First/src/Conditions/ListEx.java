package Conditions;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx {
	public static  void main(String args[]) {
		
		
		ArrayList<Integer> Number = new ArrayList<Integer>();
		
		Number.add(1);
		Number.add(2);
		Number.add(1);
		Number.add(3);
		Number.add(4);
		
		Iterator<Integer> i= Number.iterator();
		while(i.hasNext()){  
			   System.out.println(i.next());  
			  }  
		
				
	}

}
