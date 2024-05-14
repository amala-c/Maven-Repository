package excersises;

public class InstanceMethodEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceMethodEg2 obj =new InstanceMethodEg2();
		obj.getdata();
		double d = obj.deposit();
		System.out.println("Deposit is "+d);
		obj.withdraw();
	}
	
	String name;
	long accountno;
	String actype;
	double bamount;
	public void getdata()
	{
		name= "Parvathy";
		accountno=13213123123123l;
		actype="Savings";
		 bamount=10000;
	}
	
	public double deposit()
			{
			bamount=bamount+200;
			return bamount;
			}

	public void withdraw()
	{
		System.out.println("Balance is "+bamount);
		bamount=bamount-100;
		System.out.println("Balance is "+bamount);
		
	}
}
