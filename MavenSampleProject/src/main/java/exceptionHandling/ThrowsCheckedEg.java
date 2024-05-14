package exceptionHandling;

import java.io.IOException;

public class ThrowsCheckedEg {

	public static void print()throws IOException
	{
		throw new IOException("Exception happened");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			print();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception happened");
			e.printStackTrace();
		}
		 System.out.print("Code after try-catch block");
	}

}
