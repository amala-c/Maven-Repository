package collection;

import java.util.ArrayList;

public class Colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList l2= new ArrayList(); //non generic type , we can add elements of any type to this collection
		l2.add("Red");
		l2.add("Green");
		l2.add("Orange");
		l2.add("Yellow");
		//l2.add(12);
		System.out.println("ArrayList with colors" +l2);

	}

}
