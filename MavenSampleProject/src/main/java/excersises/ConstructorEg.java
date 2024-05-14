package excersises;

public class ConstructorEg {

	ConstructorEg()
	{
		this(3,5,2);
		System.out.println("Default constructor");
	}
	
	int num1;
	int num2;
	int num3;
	ConstructorEg(int a, int b)// if parameter passed in method and instance variable name are different, no need to use this keyword.
	{
		
		num1=a;
		num2=b;
		System.out.println("Num1 is "+num1);
		System.out.println("Num2 is "+num2);
	}
	
	ConstructorEg(int num1,int num2, int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		System.out.println("Num1 is "+num1);
		System.out.println("Num2 is "+num2);
		System.out.println("Num3 is "+num3);
		
	}
	
	public void sum()
	{
		
		int sum = num1+num2+num3;
		System.out.println("Sum is"+sum);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorEg obj=new ConstructorEg();
		ConstructorEg obj2=new ConstructorEg(2,3);
		ConstructorEg obj3=new ConstructorEg(2,3,2);
		obj3.sum();
	}

}
