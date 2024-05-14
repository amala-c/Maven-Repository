package exceptionHandling;

public class Sample1 {

	public static void main(String[] args) {
		int a=12;
		int b=4;
		
		try
		{
			int result=a+b/0;
		    System.out.println(result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Divison by zero is not possible");
		}
		 System.out.print("Code after try-catch block");

	}

}

