package com.FlightBookingService.CheckinService.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CheckinObject {

	@Id
	private String id;
	private String seatid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSeatid() {
		return seatid;
	}
	public void setSeatid(String seatid) {
		this.seatid = seatid;
	}
	public CheckinObject(String id, String seatid) {
		this.id = id;
		this.seatid = seatid;
	}
	

	
	
}
