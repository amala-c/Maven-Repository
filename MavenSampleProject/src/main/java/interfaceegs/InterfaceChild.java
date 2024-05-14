package interfaceegs;

public class InterfaceChild implements InterfaceEg{

public void print()
{
	System.out.println("Example for Interface");
	System.out.println("Max value" +MAX_VALUE);
}
	public void display()
	{
		System.out.println("Example for Interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceEg obj=new InterfaceChild(); //object created through upcasting 
		obj.print();
		obj.display();
		
	}

}
