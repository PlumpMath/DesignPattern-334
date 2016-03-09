package behavpattern.observer;

public class Client {

	public static void main(String[] args) {

		MealOrder order = new MealOrder();
		order.addObserver(new Waiter());
		order.setStatus("accepted");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		order.setStatus("completed");
	}

}
