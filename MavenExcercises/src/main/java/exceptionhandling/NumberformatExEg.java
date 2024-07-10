package exceptionhandling;

public class NumberformatExEg {
	
	public static void addnum(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum of two numbers "+sum);
		if (sum>50)
		{
			
			throw new ArithmeticException("Exception happened");
		}
		else
		{
			System.out.println("Sum of two numbers "+sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			addnum(25,35);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("50 is greater than sum of the numbers");
		}
		
	}


}
