package aggregation;

public class Address {

	String houseName;
	String addressLine1;
	String addressLine2;
	public Address(String houseName,String addressLine1, String addressLine2)
	{
		this.houseName=houseName;
		this.addressLine1=addressLine1;
		this.addressLine2=addressLine2;
		System.out.println("House Name :"+houseName);
		System.out.println("Address Line 1 :"+addressLine1);
		System.out.println("Address Line 1 :"+addressLine2);
	}
	
	
	
}
