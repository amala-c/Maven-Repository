package abstraction;

public class Demo extends Sample{
	public void print()
	{
		System.out.println("Implementation of abstract method"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj=new Demo();
		obj.print();
		obj.display();
		
	}

}
