package abstraction;

public class Contract extends Employee {
	double paymentPerHour, workingHours;
	
Contract(double paymentPerHour ,double workingHours )
 {
	this.paymentPerHour=paymentPerHour;
	this.workingHours = workingHours;
 }
 // Implementation of abstract method

 double calculateSalary() {
     return paymentPerHour * workingHours;
 }
 
 
}
