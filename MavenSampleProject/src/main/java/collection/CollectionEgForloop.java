package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionEgForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating a List of type String using ArrayList");
		List <String> l1= new ArrayList();
		l1.add("Apple");
		l1.add("orange");
		l1.add("mango");
		l1.add("pineapple");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		//list using  foreach
		System.out.println("For each loop");
		for ( String items :  l1) 
		{
			System.out.println(items);
		}
		System.out.println(l1.get(2));
		
		l1.set(3,"grape"); //replacing index 3 value with new value
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		
		Collections.sort(l1); //sorting 
		System.out.println("Sorted list"+l1);
		
		ArrayList <String>  l2= new ArrayList <String> ();
		l2.add("String1");
		l2.add("1000");
		l2.add("String 2");
		
		l1.addAll(l2);
		System.out.println("Merged list" +l1);
		
		l1.removeAll(l2);
		System.out.println("List after removing l2" +l1);
		
		//Array list if integer type
		
		ArrayList <Integer> l3= new ArrayList <Integer> (); //to use primitive datatype , use wrapper class
		l3.add(3);
		l3.add(34);
		System.out.println("Integer list " +l3);
		
		//char
		ArrayList <Character> l4= new ArrayList <Character> (); //to use primitive datatype , use wrapper class
		l4.add('a');
		l4.add('b');
		System.out.println("Character list"+l4);
	}

}
