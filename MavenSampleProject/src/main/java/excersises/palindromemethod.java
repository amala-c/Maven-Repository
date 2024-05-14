package excersises;
import java.util.Scanner;
public class palindromemethod {

	int temp, num, reverse;
	int remainder=1;
	
	public void findReverse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		temp=num;
		if(num>0)
		{
			for(;num!=0;num/=10)
			{
				remainder=num%10;
				reverse=(reverse*10)+remainder;
				//num=num/10;
			}
			System.out.println("Reverse is" +reverse);
		
		if (temp==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		}
	if(num==0)
		
		{
			System.out.println("Enter valid number");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindromemethod obj=new palindromemethod();
		obj.findReverse();
		
	}

}
