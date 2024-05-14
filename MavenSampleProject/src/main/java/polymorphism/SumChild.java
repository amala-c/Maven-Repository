package polymorphism;

public class SumChild extends SumParent{

	
	int a , b , s,m;
	public void sum(int a, int b)
	{
		super.sum(3, 3);
		s=a+b;
		System.out.println("Sum is "+s);
	}
	public void mult(int a, int b)
	{
		m=a*b;
		System.out.println("Multplication is(From child class) "+ m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method from child class");
		SumParent obj=new SumChild();
		SumChild obj2=new SumChild();
		obj.sum(2, 10);
		obj2.difference(8, 6);
		obj2.mult(5, 8);
		//obj.mult(5,3);

	}

}
