package Conditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;;
public class SetExam {
	public static void main(String args[]) {
		
		TreeSet<Integer> HasI=new TreeSet<Integer>();
		
		HasI.add(1);
		HasI.add(2);
		HasI.add(3);
		HasI.add(1);
		
		Iterator<Integer> It=HasI.iterator();
		while(It.hasNext()) {
			System.out.println(It.next());
		}
		
	}

}
