package exceptionhandling;

public class NullpointerExEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=null;
		
		try
		{
			int s1=s.length();
			System.out.println(s1);
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}

	}

}
