package behavpattern.facade;

public class ReservationFacade {

	public FlightDetails getFlightDetails()
	{
		FlightDetails flight = new FlightDetails();
		return flight;
	}
	
	public HotelDetails getHotelDetails()
	{
		HotelDetails hotel = new HotelDetails();
		return hotel;
	}
	
}
