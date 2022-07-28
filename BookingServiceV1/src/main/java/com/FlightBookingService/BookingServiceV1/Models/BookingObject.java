package com.FlightBookingService.BookingServiceV1.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BookingObject {
	
     @Id
     private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BookingObject(String id) {
		this.id = id;
	}
     
     
     
}
