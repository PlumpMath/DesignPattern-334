package crea.pattern.factory;

/**
 * 
 * @author ibaner
 * 
 *         Sub Class 1 / Product 1
 *
 */

public class HousingLoan extends LoanAccount {

	public HousingLoan(double rateOfInterest) {
		super(rateOfInterest);
	}

	@Override
	public double calculatEMI(double loanAmt, double tenure) {
		return (loanAmt * getRateOfInterest() * tenure)/100;
	}

}
