package superkeywordeg;

public class AccessSpecifierEg {
protected int num1=12;
protected int num2=20;
protected void printsum()
{
	int sum =num1+num2;
	System.out.println("Sum"+sum);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		AccessSpecifierEg ob = new AccessSpecifierEg();
				ob.printsum();
		
	}

}
