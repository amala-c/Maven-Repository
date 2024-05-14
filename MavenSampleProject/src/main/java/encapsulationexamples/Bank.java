package encapsulationexamples;

public class Bank {

	//in encapsulation variables are private and methods are public
	// methods should start with get and set
	private long accountNo;
	private String name;
	private String mailId;
	
	public void setter(long accountNo, String name, String mailId)
	{
		this.accountNo=accountNo;
		this.name=name;
		this.mailId=mailId;			
	
	}
	
	public void getter()
	{
		System.out.println("Account Number :: "+accountNo);
		System.out.println("Name :: "+name);
		System.out.println("Mail Id :: "+mailId);
	}
	
}
