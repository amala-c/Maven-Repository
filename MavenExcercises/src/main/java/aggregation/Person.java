package aggregation;

public class Person {
String name;
int pincode;
Address a;

Person(String name, int pincode, Address a)
{
	this.name=name;
	this.pincode=pincode;
	this.a=a;
	
}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Pincode :"+pincode);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj=new Address("Vrindavan","Poozhikol","Kottayam");
		Person obj1=new Person("Amala",686604,obj);
		obj1.display();
		

	}

}
