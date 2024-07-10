package exceptionhandling;

public class ArithmeticExEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int num=100;
		int sum=100/0;
		System.out.println("sum is"+sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
