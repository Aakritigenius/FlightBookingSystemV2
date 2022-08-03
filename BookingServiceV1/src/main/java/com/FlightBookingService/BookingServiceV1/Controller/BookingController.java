package com.FlightBookingService.BookingServiceV1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingService.BookingServiceV1.Models.BookingObject;
import com.FlightBookingService.BookingServiceV1.Repository.BookingInterface;

@RestController
@RequestMapping("/api/version1/")
public class BookingController {

	@Autowired
	BookingInterface bookinginterface;
	
	@GetMapping("/booking")
	public List<BookingObject> getAllbookings(){
		return bookinginterface.findAll();
	}
	@PostMapping(path = "/booking")
    public String addBooking(@RequestBody BookingObject ticket){
        bookinginterface.insert(ticket);
        return String.format("Added Tickt: %s",ticket.getId());
    }
	
	 @GetMapping(path = "/booking/{bookingid}")
	    public Optional<BookingObject> getBookingById(@PathVariable String bookingid){
	        return bookinginterface.findById(bookingid);
	    }
	 
	 @PutMapping(path = "/booking/{bookingid}")
	 public String updateadminList(@PathVariable String bookingid,@RequestBody BookingObject object) {
	      object.setId(bookingid);
	      bookinginterface.save(object);
		  return String.format("Updated Booking:%s", object.getId());                                            
	 }
	   

	    @DeleteMapping(path = "/booking/{bookingid}")
	    public String deleteBooking(@PathVariable String bookingid){
	        bookinginterface.deleteById(bookingid);
	        return String.format("deleted ticket: %s",bookingid);
	    }
}
