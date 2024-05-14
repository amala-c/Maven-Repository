package superkeywordeg;

public class Animal {
	
	String name = "Dog";
	int a, b;
	public void getData()
	{
		System.out.println("Name of Animal(Parent) "+name);
	}
  
	public Animal()
	{
		System.out.println("Parent class constructor");
	}
	
	public void print()
	{
		System.out.println("Printing Name of Animal (PArent) "+name);
	}
	public void sum(int a, int b)
	{
		this.a=a;
		this.b=b;
		int sum =a+b;
		System.out.println("Sum is (from parent)   "+ sum);
	}
	
	public Animal(String name)
	{
		this.name=name;
		System.out.println("Parameterized constructor from parent");
	}
}
