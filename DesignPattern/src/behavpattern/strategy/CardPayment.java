package behavpattern.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		
		String msg = "Your payment of INR." + amt + " by " + description + " received\n";
		StringBuffer buffer = new StringBuffer(msg);
		double proceFee = amt * .012;
		double total = proceFee + amt;
		buffer.append("Processing fee of Rs." + proceFee + " is chargeable\n");
		buffer.append("Net Amount Rs." + total+"\n");
		return buffer.toString();
	}

}
