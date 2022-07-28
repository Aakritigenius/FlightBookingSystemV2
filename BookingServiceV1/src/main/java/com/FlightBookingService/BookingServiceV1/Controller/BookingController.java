package com.FlightBookingService.BookingServiceV1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingService.BookingServiceV1.Models.BookingObject;
import com.FlightBookingService.BookingServiceV1.Repository.BookingInterface;

@RestController
public class BookingController {

	@Autowired
	BookingInterface bookinginterface;
	
	@GetMapping(path="/booking")
	public List<BookingObject> getAllbookings(){
		return bookinginterface.findAll();
	}
	@PostMapping(path = "/booking")
    public String addProduct(@RequestBody BookingObject ticket){
        bookinginterface.insert(ticket);
        return String.format("Added Tickt: %s",ticket.getId());
    }
	
	 @GetMapping(path = "/booking/{bookingid}")
	    public Optional<BookingObject> getProcductById(@PathVariable String bookingid){
	        return bookinginterface.findById(bookingid);
	    }

	    @DeleteMapping(path = "/booking/{bookingid}")
	    public String deleteProduct(@PathVariable String bookingid){
	        bookinginterface.deleteById(bookingid);
	        return String.format("deleted ticket: %s",bookingid);
	    }
}
