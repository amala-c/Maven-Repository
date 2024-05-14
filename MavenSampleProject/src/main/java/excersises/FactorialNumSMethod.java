package excersises;
//import java.util.Scanner;
public class FactorialNumSMethod {

	static long num, i;
	static long fact=1;
	public static void fact(int num)
	{
		
		for(i=1;i<=num;i++)
		{
			fact= fact*i;
			
		}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact(20);

	}

}
