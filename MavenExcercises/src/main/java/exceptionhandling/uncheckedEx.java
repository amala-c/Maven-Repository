package exceptionhandling;

public class uncheckedEx {

	public static void print()
	{
		throw new  ArithmeticException("eee");
	}
	 
	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
print();
	}

}
