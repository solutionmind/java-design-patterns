package facade.design.pattern.model;

import java.util.Date;
import java.util.List;

public class CheckInCheckOut {
	private Date checkIn;
	private Date checkOut;
	private List<Hotel> hotels;
	
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public List<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

}
