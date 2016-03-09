package behavpattern.facade;

import java.util.Date;

public class HotelDetails implements Reservation {

	@Override
	public String bookingDetails() {
		return "Taj, Shereton";
	}

	@Override
	public String bookingWithDetails(String source, String destination, Date date) {
		return null;
	}

}
