package inheritance;

public class SimpleInChild extends SimpleInParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInChild obj=new SimpleInChild();
		obj.getNumbers();
		obj.getSum();

	}
	
	int sum=0;
	public void getSum()
	{
		sum=num1+num2;
		System.out.println("Sum is "+sum);
	}

}
