package excersises;
import java.util.Scanner;
public class SumofThree {

	int nsum=0;
	public void sum(int a, int b, int c)
	{
		nsum=a+b+c;
		System.out.println("Sum is "+nsum);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter num1");
	int num1=sc.nextInt();
	System.out.println("Enter num2");
	int num2=sc.nextInt();
	System.out.println("Enter num3");
	int num3=sc.nextInt();
	SumofThree obj=new SumofThree();
	
	obj.sum(num1, num2, num3);
	

	}

}
