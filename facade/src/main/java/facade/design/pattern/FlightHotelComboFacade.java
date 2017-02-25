package facade.design.pattern;

import java.util.Date;

import facade.design.pattern.model.Flight;
import facade.design.pattern.model.FlightHotelCombo;
import facade.design.pattern.model.Hotel;
import facade.design.pattern.service.impl.FlightServiceImpl;
import facade.design.pattern.service.impl.HotelServiceImpl;

/**
 * @author rajesh
 *
 */
public class FlightHotelComboFacade {
	FlightServiceImpl flightService;
	HotelServiceImpl hotelService;

	public FlightHotelCombo findFlightHotelCombo(String source, String destination, Date deaprtureTime, Date checkIn,
			Date checkOut) {

		Flight flight = flightService.findFlight(source, destination, deaprtureTime);
		Hotel hotel = hotelService.findHotel(checkIn, checkOut);

		FlightHotelCombo combo = new FlightHotelCombo();
		combo.setFlight(flight);
		combo.setHotel(hotel);
		return combo;

	}
}
