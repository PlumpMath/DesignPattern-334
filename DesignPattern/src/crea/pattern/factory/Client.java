package crea.pattern.factory;

public class Client {

	public static void main(String[] args) {

		LoanAccount account = LoanFactory.getInstance();

		System.out.println("personal Loan EMI" + account.calculatEMI(200000.00, 2));
		System.out.println("Rate Interest" + account.getRateOfInterest());

		//LoanAccount account2 = LoanFactory.getInstance(LoanType.HOUSINGLOAN);

		//System.out.println("Housing  Loan EMI" + account2.calculatEMI(50000.00, 2));
		//System.out.println("Rate Interest" + account2.getRateOfInterest());

	}

}
