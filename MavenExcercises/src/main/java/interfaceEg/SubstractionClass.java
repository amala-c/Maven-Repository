package interfaceEg;

public class SubstractionClass implements SubstractionInterface {
	
	//abstract method implementation
	public void sub()
	{
		int s=NUM1-NUM2;
		System.out.println("Substraction "+s);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SubstractionClass obj =new SubstractionClass();
		obj.sub();

	}

}
