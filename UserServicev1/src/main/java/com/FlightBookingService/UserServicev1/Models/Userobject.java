package com.FlightBookingService.UserServicev1.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Name")
public class Userobject {
	
	@Id
     private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Userobject(String id) {
		this.id = id;
	}
	
	
     
}
