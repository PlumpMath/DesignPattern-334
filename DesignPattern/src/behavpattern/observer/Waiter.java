package behavpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {

	@Override
	public void update(Observable o, Object arg) {

		String msg = null;
		if(o instanceof MealOrder)
			msg = (String)arg;
		if(msg.equalsIgnoreCase("Accepted"))
			System.out.println("Yay! Order Accepted!");
		else if(msg.equalsIgnoreCase("Completed"))
			System.out.println("Congrats! Order Ready!");
		else System.out.println("Order Pending");
		
	}

}
