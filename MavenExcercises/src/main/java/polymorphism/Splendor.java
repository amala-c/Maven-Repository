package polymorphism;

public class Splendor extends Bike{
	public void run()
	{
		System.out.println("Bike run , run Splendor");
	}
	public static void main(String[] args) {
	
		Bike b= new Splendor();
		b.run();

	}

}
