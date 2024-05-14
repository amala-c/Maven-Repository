package excersises;
import java.util.Scanner;
public class FactNumwhile {

	static long number,i=1;
	static long fact=1;
	
	
	public static long findFact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		number=sc.nextInt();
		
		while(i<=number)
		{
			fact=fact*i;
			i++;			
		}
		return fact;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	long result=findFact();
	System.out.println(result);

	}

}
