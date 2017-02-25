package facade.design.pattern.model;

import java.util.Date;
import java.util.List;

public class Schedule {
	private String source;
	private String destination;
	private Date deaprtureTime;
	private List<Flight> flights;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDeaprtureTime() {
		return deaprtureTime;
	}
	public void setDeaprtureTime(Date deaprtureTime) {
		this.deaprtureTime = deaprtureTime;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
}
