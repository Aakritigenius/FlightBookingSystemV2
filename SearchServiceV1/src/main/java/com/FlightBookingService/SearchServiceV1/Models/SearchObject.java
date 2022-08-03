package com.FlightBookingService.SearchServiceV1.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class SearchObject {
	
	@Id
	private String id;
	private String departure_city;
	private String destination;
	private String date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeparture_city() {
		return departure_city;
	}
	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public SearchObject(String id, String departure_city, String destination, String date) {
		this.id = id;
		this.departure_city = departure_city;
		this.destination = destination;
		this.date = date;
	}
	
    
	
	

}
