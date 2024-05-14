package inheritance;
import java.util.Scanner;
public class SimpleInParent {

	int num1,num2;
	
	public void getNumbers()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		num1=sc.nextInt();
		System.out.println("Enter number 2");
		num2=sc.nextInt();
		sc.close();
		
	}
	
	
}
