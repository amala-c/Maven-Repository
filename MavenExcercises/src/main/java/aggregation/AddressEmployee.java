package aggregation;

public class AddressEmployee {

	String hname,city,state;
	int pincode;
	
	
	public AddressEmployee(String hname, String city, String state, int pincode)
	{
		this.hname=hname;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
		System.out.println("House name "+hname);
		System.out.println("City "+city);
		System.out.println("State "+state);
		System.out.println("Pincode " +pincode);
		
	}

}
