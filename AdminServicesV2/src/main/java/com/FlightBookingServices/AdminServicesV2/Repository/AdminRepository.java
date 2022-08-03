package com.FlightBookingServices.AdminServicesV2.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingServices.AdminServicesV2.Models.AdminObject;

public interface AdminRepository extends MongoRepository<AdminObject, String> {

}
