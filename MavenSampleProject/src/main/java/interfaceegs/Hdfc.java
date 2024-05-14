package interfaceegs;

public class Hdfc implements Rbi{
    // Implementing the recurringDeposit method
    public void recurringDeposit(double amount, int duration)
    {
        double interestRate = getInterestRate();
        double totalAmount = amount * Math.pow(1 + interestRate, duration);
        System.out.println("Total amount  " + totalAmount);
    }

    // Implementing the getInterestRate method
    public double getInterestRate()
    {
        return 0.06; // 6%
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Creating HDFC object
        Rbi obj = new Hdfc();
        
        // Customer's deposit details
        double depositAmount = 10000; // Amount deposited
        int depositDuration = 5; // Duration in years

        // Calculating total amount after depositing for the given duration
        obj.recurringDeposit(depositAmount, depositDuration);
        //System.out.println("Total amount after " + depositDuration + " years: $" + totalAmount);
		

	}

}
