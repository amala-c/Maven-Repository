package aggregation;

public class Employee {
	
	String name;
	String empcode;
	AddressEmployee ad;

	public Employee(String name , String empcode, AddressEmployee ad) {
		this.name=name;
		this.empcode=empcode;
		this.ad=ad;

	}
public void print()
{
	System.out.println("Employee Name "+name);
	System.out.println("Employee Code "+empcode);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressEmployee obj=new AddressEmployee("Vrindavan","Kottayam","Kerala",686604);
		Employee obj1=new Employee("Amala","EMP001",obj);
		obj1.print();
		

	}

}
