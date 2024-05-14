package polymorphism;

public class Onseason {
	
	int price, d =0;
	public void discount(int price)
	{
		d=(price*40)/100;
		int totalp=price-d;
		System.out.println("Price after discount is "+totalp);
	}
	

}
