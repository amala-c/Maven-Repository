package aggregation;

public class StudentAggregation {

	String sname;
	int age;
	AddressAggregation  a;
	public StudentAggregation(String sname, int age, AddressAggregation a)
	{
		this.sname=sname;
		this.age=age;
		this.a=a;
		
	}
	public void print()
	{
		System.out.println("Student name is "+sname);
		System.out.println("Age is "+ age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AddressAggregation obj1=new AddressAggregation("XYZ","Kottayam",653320);
		StudentAggregation obj=new StudentAggregation("Anu",20,obj1);
		obj.print();
		
	}

}
