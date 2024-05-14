package interfaceEg;

public class Abclass implements Interface001 {
	
	
	public void sum()
	{
		int s= NUM1+NUM2;
		System.out.println("Sum is " +s);
		
	}
	
	public static void main(String args[])
	{
		Abclass obj=new Abclass();
		obj.sum();
	}

}
