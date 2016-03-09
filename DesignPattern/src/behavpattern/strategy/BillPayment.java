package behavpattern.strategy;

public class BillPayment {

	private PaymentStrategy strgy;

	public BillPayment() {
		super();
	}

	public BillPayment(PaymentStrategy strgy) {
		super();
		this.strgy = strgy;
	}

	public PaymentStrategy getStrgy() {
		return strgy;
	}

	public void setStrgy(PaymentStrategy strgy) {
		this.strgy = strgy;
	}
	
	public String makePayment(double amount, String description)
	{
		return strgy.pay(amount, description);
	}
	
}
