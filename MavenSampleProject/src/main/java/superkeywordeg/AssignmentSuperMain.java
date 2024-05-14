package superkeywordeg;

public class AssignmentSuperMain extends AssignmentSuperkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AssignmentSuperMain obj= new AssignmentSuperMain();
		int d1= obj.numDivisible();
		
		System.out.println("Remainder of sum of number " +obj.getSum() +" by 10 is   " +d1);
		if(d1==0)
		{
			System.out.println("Sum of entered numbers is divisible by 10");
		}
		else if(d1!=0)
		{
			System.out.println("Sum of entered numbers is  Not Divisible by 10");
		}

	}
	int d;
	int numdiv;
	public int numDivisible()
	{
		super.getdata();
		d= super.getSum();
		System.out.println("Sum is"+d);
		numdiv=d%10;
		return numdiv;
	}

}
