package collections;
import java.util.*;
public class iteratorEgArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList <String> l1=new ArrayList<String>();
		l1.add("Apple");
		l1.add("ooo");
		l1.add("asa");
		
		Iterator i=l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
