package com.FlightBookingService.SearchServiceV1.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingService.SearchServiceV1.Models.SearchObject;

public interface SearchInterface extends MongoRepository<SearchObject, String> {
	

}
