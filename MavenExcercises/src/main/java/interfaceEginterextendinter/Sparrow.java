package interfaceEginterextendinter;

public class Sparrow implements Bird{
	
	public void eat() {
		System.out.println("From Animal interface - eat method");
	}
	public void sleep()
	{
		System.out.println("From Animal interface - sleep method");
	}
	public void fly()
	{
		System.out.println("From Bird interface - fly method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sparrow obj=new Sparrow();
		obj.eat();
		obj.sleep();
		obj.fly();

	}

}
