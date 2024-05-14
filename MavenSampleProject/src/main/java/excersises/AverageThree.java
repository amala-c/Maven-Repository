package excersises;
import java.util.Scanner;
public class AverageThree {
	
	   public static void main(String args[])
	   {
	    AverageThree obj=new AverageThree();
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integer numbers");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int c=sc.nextInt();
		int avgi=obj.avg(a,b,c);
		System.out.println("Average of three interger number is " +avgi);
		System.out.println("Enter 3 floating point numbers");
		float a1=sc.nextFloat();
		float b1=sc.nextFloat();
		float c1=sc.nextFloat();
		float avgf=obj.avg(a1,b1,c1);
		System.out.println("Average of three Floating point number is " +avgf);
	   }
	   
	   public int avg(int a, int b , int c)
	   {
	     int a1=(a+b+c)/3;
		 return a1;
	   }
	   public float avg(float a, float b,float c)
	   {
		    float a2=(a+b+c)/3;
			return a2;
	   }
	}

