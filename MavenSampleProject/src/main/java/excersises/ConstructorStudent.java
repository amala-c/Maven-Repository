package excersises;

public class ConstructorStudent {
	
	  String name;
	  int rollno, age;
	  public ConstructorStudent()
	  {
	    System.out.println("Nonparametrized constructor"); //Non parameterized constructor
	  }
	  
	  public ConstructorStudent(String n,int rn, int a) //initializing static variable with local variable values
	  {
	    name=n;
		rollno=rn;
		age=a;
	  }
	  public void display() //Method to print variables
	  {
	  	 System.out.println("Name "+name);
		System.out.println("RollNo "+rollno);
		System.out.println("Age "+age);
	  }
	  public static void main(String args[])
	  {
		  ConstructorStudent obj =new ConstructorStudent();
		  ConstructorStudent obj2=new ConstructorStudent("Anu",23,24);
		  ConstructorStudent obj3=new ConstructorStudent("Sonu",13,24);
		System.out.println("Student1 details\n");
		obj2.display();
		System.out.println("Student2 details\n");
		obj3.display();
	  }
	}


