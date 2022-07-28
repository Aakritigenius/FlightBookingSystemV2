package com.FlightBookingService.FareServicev1.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FareObject {
	
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FareObject(String id) {
		this.id = id;
	}
	
	

}
