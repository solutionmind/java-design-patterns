package facade.design.pattern;

import java.util.Date;

import facade.design.pattern.model.Hotel;
import facade.design.pattern.service.HotelService;
import facade.design.pattern.service.impl.HotelServiceImpl;

/**
 * @author rajesh
 *
 */
public class HotelFacade implements HotelService {
	
	HotelServiceImpl hotelService;

	public Hotel findHotel(Date checkIn, Date checkOut) {
		return hotelService.findHotel(checkIn, checkOut);
	}

}
