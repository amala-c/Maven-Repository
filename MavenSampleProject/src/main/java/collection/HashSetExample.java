package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Generic collection");
		
		HashSet<String> l1=new HashSet();
		l1.add("ABC");
		l1.add("dsd");
		l1.add("ABC");
		System.out.println(l1);
		System.out.println("Non generic collection");
		HashSet l2=new HashSet();
		l2.add("ABCDD");
		l2.add(1232);
		l2.add(12);
		l2.add("APPLE");
		
		System.out.println(l2);		
		
		Iterator<String> i=l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
i.remove();
System.out.println("Removed last element from HashSet l2" +l1);
l1.remove("dsd");
System.out.println("Removed  element from HashSet l1"+l1);

l1.add("HAI");
System.out.println("Adding elements" +l1);

System.out.println("Size is" +l2.size());
System.out.println("Searching an element " +l2.contains(12) );

///linked list

LinkedList <Integer> l3=new LinkedList <Integer>();
l3.add(123);
l3.add(2343);
l3.add(12003);
l3.add(200);
System.out.println("L3 collection "+ l3);
l3.remove();
System.out.println("L3 collection after removing element "+ l3);



LinkedList <String> l4=new LinkedList <String>();
l4.add("aa");
l4.add("bbb");
l4.add("kkk");

System.out.println("L4 collection "+ l4);
l4.remove("kkk");
System.out.println("L4 collection after removing element "+ l4);
l4.addFirst("weee");
System.out.println("L4 collection after adding element first"+ l4);
l4.addLast("yee");
System.out.println("L4 collection after adding element last"+ l4);
	}

}
