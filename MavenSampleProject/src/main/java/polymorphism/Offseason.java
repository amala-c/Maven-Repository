package polymorphism;
import java.util.Scanner;
public class Offseason extends Onseason {

	
	int price, d =0;
	public void discount(int price)
	{
		d=(price*15)/100;
		int totalp=price-d;
		System.out.println("Price after discount is "+totalp);
	}
	
	public void display()
	{
		while(true)
		{
		System.out.println("option 1: OnSeason");
		System.out.println("option 2: OffSeason");
		System.out.println("option 3: exit");
		System.out.println("Enter your option");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option)
		{
		case 1 : super.discount(5000);//child discount called
		break;
		case 2 : discount(2000);
		break;
		case 3: System.exit(0);
		default:
			System.out.println("invalid option");
			sc.close();
		}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Onseason obj =new Offseason();
		Offseason obj1=new Offseason();
		
		obj1.display();
	
	}

	

}
