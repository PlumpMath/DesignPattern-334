package behavpattern.facade;

import java.util.Date;

public class FlightDetails implements Reservation {

	@Override
	public String bookingDetails() {
		return "AI861, AI841, AI890";
	}

	@Override
	public String bookingWithDetails(String source, String destination, Date date) {
		if(source.equalsIgnoreCase("Mumbai"))
		{
			if(destination.equalsIgnoreCase("Delhi"))
				return "AI861, AI741, AI763";
			else if(destination.equalsIgnoreCase("Kolkata"))
				return "Jet562, AI542";
			else
				return "Not available currently";
		}
		else if(source.equalsIgnoreCase("Delhi"))
		{
			if(destination.equalsIgnoreCase("Mumbai"))
				return "AI862, AI742, AI764";
			else if(destination.equalsIgnoreCase("Kolkata"))
				return "Jet563, AI543";
			else
				return "Not available currently";
		}
		else
			return "Not available currently";
	}
	
}
