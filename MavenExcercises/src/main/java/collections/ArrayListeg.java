package collections;
import java.util.*;
public class ArrayListeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//non generic arrayList
		
		ArrayList l1=new ArrayList();
		l1.add("dsad");
		l1.add("asasdsad");
		l1.add("adsad");
		l1.add(null);
		
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.contains("adsad"));
		System.out.println(l1.isEmpty());
		System.out.println(l1.remove(1));
		System.out.println(l1);
		System.out.println(l1.remove(null));
		System.out.println(l1);
		
		
		//generic ArrayList
		
		ArrayList <String> arr=new ArrayList<String>();
		System.out.println(arr.isEmpty());
		
	}

}
