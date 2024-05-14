package collection;

import java.util.List;
import java.util.ArrayList;

public class CollectionPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating a List of type String using ArrayList");
		List <String> l1= new ArrayList();
		l1.add("Apple");
		l1.add("orange");
		l1.add("mango");
		System.out.println("List elements "+l1);
		System.out.println("Size of list "+l1.size());
		
		System.out.println("Non generic collection");
		
		ArrayList l2= new ArrayList();
		l2.add("String1");
		l2.add(1000);
		
		System.out.println("Elements of nongeneric collection "+l2);
		System.out.println("Size of nongeneric collection "+l2.size());
		
		
		
		System.out.println("Generic collection");
		
		ArrayList <String> l3= new ArrayList <String>();
		l3.add("ABC");
		l3.add("EFG");
		l3.add("NJK");
		System.out.println("Elements of generic collection "+l3);
		System.out.println("Size of generic collection "+l3.size());
		System.out.println("To check generic collection empty "+l3.isEmpty());
		System.out.println("To check generic collection contains specific value");
		System.out.println(l3.contains("ABC"));
		
		//adding nulls and duplicate values
		l3.add(null);
		l3.add(null);
		l3.add(null);
		l3.add("ABC");
		System.out.println("Elements of generic collection "+l3); //collections are growable
		
		System.out.println(l3.remove("EFG")); //removing particular element from collection
		System.out.println("Elements of generic collection "+l3); 
		
		System.out.println(l3.remove(0)); //removing by index
		System.out.println("Elements of generic collection "+l3); 
		
		
	}

}
