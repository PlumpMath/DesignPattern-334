package crea.pattern.factory;

/**
 * 
 * @author ibaner
 * 
 * Factory class with a Static Method
 *
 */

public abstract class LoanAccount {

	private double rateOfInterest;

	public LoanAccount(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	public abstract double calculatEMI (double loanAmt, double tenure);

	public double getRateOfInterest() {
		return rateOfInterest;
	}
	
}
