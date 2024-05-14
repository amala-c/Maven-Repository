package excersises;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,m=0;
		int num=99;
		m=num/2;
		if(num==0||num==1)
		{
			System.out.println("Not prime");
			
		}
		else
		{
			for(i=2;i<=m;)
			{
				if(num%i==0)
				{
					System.out.println("Not");
				}
				else if(num%i==1)
				{
					System.out.println("Prime");
				}
				break;
			}
		}

	}

}
