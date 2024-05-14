package inheritanceSamples;
import java.util.Scanner;
public class GetNumParent {
int num1,num2,num3;

public void getNum()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num1");
	num1=sc.nextInt();
	System.out.println("Enter num2");
	num2=sc.nextInt();
	System.out.println("Enter num3");
	num3=sc.nextInt();
	sc.close();
}


public void sub()
{
	int s=num1-num2-num3;
	System.out.println("Difference between 3 numbers " +s);
}

}
