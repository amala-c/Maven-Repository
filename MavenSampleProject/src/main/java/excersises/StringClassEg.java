package excersises;

public class StringClassEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="     Hello World    ";
		String s2= "Hello Good morning";
		
		//trim
		String s3=s1.trim();
		System.out.println("Trim Example .......>> "+s3);
		System.out.println("Trim Example .......>> "+s1);
		
		//length
		
		System.out.println("Length Example .......>> "+ s1.length());
		
		//replace
		System.out.println("Replace Example .......>> ");
		System.out.println(s1.replace("Hello", "Hai"));
		
		//chatAt
		
		char s4=s1.charAt(5);
		System.out.println("CharAt Example .......>> "+s4);
		
		//startswith and endswith
		System.out.println("Startswith example......>>>"+ s2.startsWith("hello"));
		System.out.println("Endswith example......>>>"+ s2.endsWith("hello"));
		
		//Touppercase and Tolower case
		
		System.out.println("toUpperCase example......>>>"+ s1.toUpperCase());
		System.out.println("toLowerCase example......>>>"+ s2.toLowerCase());
		
		if(s1==s2)
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
		
		String s5=s1.concat(s3);
		System.out.println("Concatenation example......>>>"+ s5);
		int num1=1212;
		String s6=String.valueOf(num1);
		System.out.println("Value of Example.........>>>> "+s6+123);
	}

}
