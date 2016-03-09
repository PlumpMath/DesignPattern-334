package crea.pattern.factory;

/**
 * 
 * @author ibaner
 * 
 * Sub Class 2 / Product 2
 *
 */
public class PersonalLoan extends LoanAccount {

	private double processingFee;
	
	public PersonalLoan(double rateOfInterest, double processingFee) {
		super(rateOfInterest);
		this.processingFee = processingFee;
	}

	@Override
	public double calculatEMI(double loanAmt, double tenure) {
		return ((loanAmt * getRateOfInterest() * tenure)/100 + processingFee);
	}

}
