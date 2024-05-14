package superkeywordeg;

public class Dog extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj = new Dog(); // calls child constructor,,then implicitly call parent class constructor
		obj.getData();
		obj.sum(2, 5);
		
		//Dog obj1=new Dog("Dog");
		
	}
	
	String name = "XYZ";
	public void getData()
	{
		super.getData();
		super.print();
		System.out.println("Name of Animal (Child) "+name);
	}
	public Dog(String name)
	{
		super("Dog"); //calling parent class constructor// it should be the first line in constructor
		System.out.println("Parameterized constructor from child");
		
	}
	public Dog()
	{
		System.out.println("Parent variable (Child) "+ super.name);
		System.out.println("Child class constructor");
		super.sum(5, 5);
	}
	
	
}
