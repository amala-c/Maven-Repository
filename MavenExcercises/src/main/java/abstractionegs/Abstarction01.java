package abstractionegs;

public abstract class Abstarction01 {
	
	abstract void print();
	public void display()
	{
		System.out.println("Instance method from abstract class");
		disp();
	}
	
	public static void disp()
	{
		System.out.println("Static method from abstract class");
	}

}
