package facade.design.pattern;

import java.util.Date;

import facade.design.pattern.model.Flight;
import facade.design.pattern.service.FlightService;
import facade.design.pattern.service.impl.FlightServiceImpl;

/**
 * @author rajesh
 * 
 * Facade Pattern Provides a unified interface to a set of interfaces in a subsystem. Facade Pattern defines a 
 * higher-level interface that makes the subsystem easier to use.
 * 
 * In the case of facade pattern, subsystems are not aware of the existence of facade. 
 * Only facade talks and knows about subsystems.
 * 
 * Facade is tightly coupled with underlying subsystem.Any change in subsystem needs change in Facade also.
 *
 */
public class FlightFacade implements FlightService{
	
	FlightServiceImpl flightService;

	public Flight findFlight(String source, String destination, Date deaprtureTime) {
		return flightService.findFlight(source, destination, deaprtureTime);
	}

}
