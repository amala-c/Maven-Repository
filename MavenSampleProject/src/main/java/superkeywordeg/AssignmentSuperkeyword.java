/*
Program to check the addition result is divisible by 10  
Class 1 Return addition result of two numbers  
Class 2 Check the addition result is divisible by 10
(use super keyword)
*/

package superkeywordeg;
import java.util.Scanner;
public class AssignmentSuperkeyword {

	int a, b;
	int sum=0;
	//method to get numbers from
	public void getdata()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		sc.close();
	}
	public int getSum()
	{
		
		sum=a+b;
		return sum;
		
	}
}
