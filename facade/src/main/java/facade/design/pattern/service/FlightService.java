package facade.design.pattern.service;

import java.util.Date;

import facade.design.pattern.model.Flight;

public interface FlightService {
	
	public Flight findFlight(String source,String destination,Date deaprtureTime);

}
