package com.FlightBookingService.CheckinService.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingService.CheckinService.Models.CheckinObject;

public interface CheckinInterface extends MongoRepository<CheckinObject, String> {

}
