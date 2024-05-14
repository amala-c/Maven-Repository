package inheritanceSamples;

public class SumNum extends GetNumParent {

  int sum =0;
  public int sum()
  {
	  sum=num1+num2+num3;
	  return sum;
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of child class
		SumNum obj=new SumNum();
		obj.getNum();
		int s=obj.sum();
		System.out.println("Sum is "+s);
		obj.sub();
	}

}
