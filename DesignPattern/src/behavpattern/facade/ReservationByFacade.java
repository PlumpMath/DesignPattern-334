package behavpattern.facade;

public class ReservationByFacade {

	public static void main(String[] args) {

		ReservationFacade resFacade = new ReservationFacade();
		System.out.println(resFacade.getFlightDetails().bookingDetails());
		System.out.println(resFacade.getHotelDetails().bookingDetails());
		
	}

}
