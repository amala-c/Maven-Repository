package collection;

import java.util.ArrayList;

public class SearchForElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		if (list.contains("Banana")) {
		    System.out.println("Element found");
		} else {
		    System.out.println("Element not found");
		}

		
		

	}

}
