package interfaceegs;

public class InterfaceABClass implements InterfaceA,InterfaceB{
	
	public void print()
	{
		System.out.println("Method from InterfaceA");
		System.out.println("Num 1 value  " +NUM1);
	}
		public void display()
		{
			System.out.println("Method from InterfaceB");
			System.out.println("Num 1 value  " +NUM2);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceABClass obj=new InterfaceABClass();
		obj.print();
		obj.display();

	}

}
