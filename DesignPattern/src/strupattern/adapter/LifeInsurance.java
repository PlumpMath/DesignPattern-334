package strupattern.adapter;

/**
 * 
 * @author ibaner
 *
 *         Adaptee
 *
 */

public class LifeInsurance {

	private double policyAmount;

	public LifeInsurance(double policyAmount) {
		super();
		this.policyAmount = policyAmount;
	}

	public double calculatePremium() {
		return policyAmount * 0.25;
	}

}