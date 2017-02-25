package facade.design.pattern.service;

import java.util.Date;

import facade.design.pattern.model.Hotel;

public interface HotelService {
	
	public Hotel findHotel(Date checkIn,Date checkOut);

}
