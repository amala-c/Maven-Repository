package aggregation;

public class AddressAggregation {
	
	String housename;
	String place;
	int pincode;
	public AddressAggregation(String housename,String place,int pincode)
	{
		this.housename=housename;
		this.place=place;
		this.pincode=pincode;
		System.out.println("House  name is "+housename);
		System.out.println("Place is "+place);
		System.out.println("Pincode is " +pincode);
	}

}
