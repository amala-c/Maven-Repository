package exceptionHandling;

public class LicenceUsage {

	public static void checkAge(int age) throws LicenceException
	{
		if (age<18)
		{
			throw new LicenceException("Not Eligible");
		}
		else
		{
			System.out.println("License approved");
		}
	}
	
	public static void main(String[] args) throws LicenceException {
		// TODO Auto-generated method stub
		
		checkAge(14);

	}

}
