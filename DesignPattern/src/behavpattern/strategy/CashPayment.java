package behavpattern.strategy;

public class CashPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		String msg = "Your payment of INR." + amt + " by " + description + " received\n";
		StringBuffer buffer = new StringBuffer(msg);
		double proceFee = amt * .012;
		double discount = proceFee * 0.005;
		double total = proceFee + amt - discount;
		buffer.append("Processing fee of Rs." + proceFee + " is chargeable" + " discount of Rs." + discount + " for cash payment\n");
		buffer.append("Net Amount Rs." + total+"\n");
		return buffer.toString();
	}

}
