package com.FlightBookingService.FareServicev1.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingService.FareServicev1.Models.FareObject;

public interface FareInterface extends MongoRepository<FareObject, String> {
        
}
