package superegs;

public class SuperParentAnimal {
	String name= "Dog From Parent";
	int a, b;
	
	public SuperParentAnimal() 
	{
		System.out.println("Name is  " +name);

	}
	
	public void print() {
		System.out.println("Name is Printing from parent" +name);
		
	}
	
	public void sum(int a, int b)
	{
		this.a=a;
		this.b=b;
		int sum=a+b;
		System.out.println("Sum is"+sum);
		
	}
	
	public SuperParentAnimal(String name)
	{
		this.name=name;
		System.out.println("Name is " +name);
	}
		
	
		
		
	

}
