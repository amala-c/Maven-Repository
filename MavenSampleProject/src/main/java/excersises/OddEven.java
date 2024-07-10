package excersises;


public class OddEven {
	public boolean  check()
	{
		int num =20;
		if(num%2==0)
		{
			return true;	}
	
	else
	{
		return false;
	}
	}
	public static void main(String[] args)
	{
	
		
		OddEven obj=new OddEven();
		
		boolean b=obj.check();
		System.out.println("Even number "+b);
	}

}
