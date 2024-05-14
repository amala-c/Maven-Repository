package excersises;

//4. Write a program to check whether the given number is Armstrong/Not. 
import java.util.Scanner;  
import java.lang.Math;  
class Armstrong {

public static void main(String[] args)
{
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the limit: "); 
num=sc.nextInt();
int temp, digits=0, last=0, sum=0;   
//assigning num into a temp variable  
temp=num;   
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  (Math.pow(last, digits));   
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(num==sum)   
//returns if sum and n are equal  
System.out.print("Amstrong number");    
//returns false if sum and n are not equal  
else 
	System.out.print("Not an Amstrong number");    


sc.close();

}
}
