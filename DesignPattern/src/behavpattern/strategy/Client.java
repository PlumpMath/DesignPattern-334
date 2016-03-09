package behavpattern.strategy;

public class Client {

	public static void main(String[] args) {

		BillPayment bill = new BillPayment();
		CardPayment pmt = new CardPayment();
		bill.setStrgy(pmt);
		System.out.println(bill.makePayment(5000, "HDFC Card 4769 5100 XXXX XXXX"));
		CashPayment pmt2 = new CashPayment();
		bill.setStrgy(pmt2);
		System.out.println(bill.makePayment(5000, "Cash"));
	}

}
