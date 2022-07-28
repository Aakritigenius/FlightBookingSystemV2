package com.FlightBookingService.AdminServiceV1.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingService.AdminServiceV1.Models.AdminFlight;

public interface Admininterface extends MongoRepository<AdminFlight,String> {

}
