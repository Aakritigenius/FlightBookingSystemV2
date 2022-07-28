package com.FlightBookingService.BookingServiceV1.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingService.BookingServiceV1.Models.BookingObject;

public interface BookingInterface extends MongoRepository<BookingObject, String> {

}
