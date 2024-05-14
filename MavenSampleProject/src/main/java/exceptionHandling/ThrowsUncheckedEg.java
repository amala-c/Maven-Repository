package exceptionHandling;

public class ThrowsUncheckedEg {
	
	
	public static void display() throws ArithmeticException
	{
		throw new ArithmeticException("Exception occured");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();

	}

}
