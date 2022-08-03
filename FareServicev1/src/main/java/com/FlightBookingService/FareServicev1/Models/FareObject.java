package com.FlightBookingService.FareServicev1.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FareObject {
	
	@Id
	private String id;
	private String flightname;
	private int fare;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public FareObject(String id, String flightname, int fare) {
		this.id = id;
		this.flightname = flightname;
		this.fare = fare;
	}

	
	

}
