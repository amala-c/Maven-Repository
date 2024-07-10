package polymorphism;

public class CalChild extends CalParent{
	int num1, num2;
	public void sum(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
		int sum=num1+num2;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		CalParent obj=new CalChild();
		obj.sum(5,6);

	}

}
