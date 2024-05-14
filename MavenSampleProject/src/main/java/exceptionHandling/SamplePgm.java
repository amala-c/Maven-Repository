package exceptionHandling;

public class SamplePgm {

	public static void main(String[] args) {
		int a=12;
		int b=4;
		
		try
		{
			int result=a+b/0;
		    System.out.println(result);
			int arr[]=new int[5];
			System.out.println(arr[10]);
		}
		

		catch(ArithmeticException e)
		{
			System.out.println("Divison by zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Check the size of array");
		}
		catch(Exception e)
		{
			System.out.println("Parent class exception");
		}

		finally
		{
			System.out.print("*************Finally block**********     ");
			int a1=2;
			int b1=2;
			int r=a1+b1;
			System.out.println("Result of a1+b1 is "+r);
				       
		}
       System.out.print("Code after try-catch block");
       
       
       
	}

}
