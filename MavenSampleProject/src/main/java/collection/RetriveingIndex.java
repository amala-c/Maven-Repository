package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RetriveingIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList l2= new ArrayList();
		l2.add("Pen");
		l2.add("Pencil");
		l2.add("Orange");
		l2.add("Puppy");
		//System.out.println("Getting specified index value " +l2.get(2));
		
		Iterator i=l2.iterator();
		while(i.hasNext()) //return type boolean
		{
			System.out.println(i.next()); //next() returns object
		}

		ArrayList <Integer> l3=new ArrayList <Integer>();
				
		l3.add(12);
		l3.add(45);
		l3.add(100);
		Iterator <Integer> j=l3.iterator();
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
			
		j.remove(); //to remove last element, return type is void
		
			System.out.println(l3);
		
	}

}
