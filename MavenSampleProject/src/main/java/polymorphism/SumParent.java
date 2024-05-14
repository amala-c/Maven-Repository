package polymorphism;

public class SumParent {

	int a , b , s,d;
	public void sum(int a, int b)
	{
		//System.out.println("Method from Parent class");
		s=a+b;
		System.out.println("Sum is "+s);
	}
	
	public void difference(int a, int b)
	{
		System.out.println("Method from Parent class");
		d=a-b;
		System.out.println("Difference is "+ d);
	}
	

}
