package abstraction;

public class FullTimeEmployee extends Employee {
	
	// Properties
    private double salary;

    // Constructor
    public FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    // Implementation of abstract method
    
    double calculateSalary() {
        // Assuming a constant of 8 hours for a full-time employee
        return salary * 8;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Creating objects for Contract class
		Contract obj=new Contract(200,30);
		double sal= obj.calculateSalary();
		System.out.println("Salary for contractor is "+sal);
		
		
		 // Creating objects for FullTimeEmployee class
		FullTimeEmployee obj1=new FullTimeEmployee(2000);
		double fsal= obj1.calculateSalary();
		System.out.println("Salary for Full time Employee is "+fsal);
    }
		
	}


