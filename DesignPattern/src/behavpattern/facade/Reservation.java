package behavpattern.facade;

import java.util.Date;

public interface Reservation {

	public String bookingDetails();
	public String bookingWithDetails(String source, String destination, Date date);
}
