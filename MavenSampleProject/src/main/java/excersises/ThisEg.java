package excersises;

public class ThisEg {

	int num1;
	public void display(int a)
	{
		num1=a;
		System.out.println("System.out.println" +a);
	}
	
	int num2;
	public void print(int a, int b)
	{
		num1=a;
		num2=b;
		System.out.println("System.out.println" +a);
		System.out.println("System.out.println" +b);
	}
	
	int num3;
	public void sprint(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		System.out.println("System.out.println" +num1);
		System.out.println("System.out.println" +num2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThisEg obj=new ThisEg();
		obj.display(2);
		obj.print(3, 5);
		obj.sprint(3,2);

	}

}
