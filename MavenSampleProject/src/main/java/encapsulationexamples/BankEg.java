package encapsulationexamples;

public class BankEg {
private int pinNo;
public void setPin(int pinNo)
{
	this.pinNo=pinNo;


}

    public void getPin()
    {
    	System.out.println("Pin NO entered is "+pinNo);
    }
    
    public void validate()
    {
    	if (pinNo==1001||pinNo==1234||pinNo==1212)
    	{
    		System.out.println("Valid PIN NO");
    	}
    	
    	else
    	{
    		System.out.println("InValid PIN NO");
    	}
    }
}
