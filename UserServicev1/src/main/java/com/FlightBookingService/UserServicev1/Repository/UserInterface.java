package com.FlightBookingService.UserServicev1.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingService.UserServicev1.Models.Userobject;

public interface UserInterface extends MongoRepository<Userobject, String> {

}
