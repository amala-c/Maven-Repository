package exceptionhandling;

import java.io.IOException;

public class ThrowsChecked {
	public static void print()throws IOException
	{
		throw new IOException("Exception happened");
	}

	public static void main(String[] args) {
		try
		{
			print();
		}
		catch(IOException e)
		{
			System.out.println("Exception");
			e.printStackTrace();
		}
	}

}
