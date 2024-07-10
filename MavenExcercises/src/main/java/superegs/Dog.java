package superegs;

public class Dog extends SuperParentAnimal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj=new Dog();
		obj.getdata();
		

	}
	
	
	public Dog() {
		super();
	}
	
	public void getdata()
	{
		super.print();
		super.sum(12, 10);
		
		
	}
	public Dog(String name)
	{
		super("Dog");
		
	}


}
