package excersises;
/*
 2. Write a program to check whether the customer have discount
  (get 20% discount if total amount is greater than 5000) or not and 
  get the final amount in main method. (static methods) 
  Get prices of items using parameterized method •
  Method 1 - Calculate total amount. Method 2 - Check discount.
 */

import java.util.Scanner;

public class SamplePgm {

int totalprice=0;	
int prices[]=new int[3];
int discount;
public int totalAmount()
{
System.out.println("Enter prices");
Scanner sc=new Scanner(System.in);
for(int i=0;i<=2;i++)
{
	prices[i]=sc.nextInt();
}
  	for(int i=0;i<=2;i++)
  	{
  		totalprice=totalprice+prices[i];
  	}
  	
  	return totalprice;
  	
}	
	
	public void checkDiscount()
	{
	
		discount=(totalprice*20)/100;
		System.out.println("Discount is"+discount);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SamplePgm obj =new SamplePgm();
		int a=obj.totalAmount();
		System.out.println("Amount is "+a);
		obj.checkDiscount();
		

	}

}
