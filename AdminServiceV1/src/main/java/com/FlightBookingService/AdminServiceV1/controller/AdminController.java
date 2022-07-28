package com.FlightBookingService.AdminServiceV1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingService.AdminServiceV1.Models.AdminFlight;
import com.FlightBookingService.AdminServiceV1.Repository.Admininterface;

@RestController
public class AdminController {
	
	@Autowired
	Admininterface admininterface;
	
	@GetMapping(path = "/admin")
    public List<AdminFlight> getProducts(){
        return admininterface.findAll();
    }
	
	@PostMapping(path = "/admin")
    public String addProduct(@RequestBody AdminFlight adminflightpost){
        admininterface.insert(adminflightpost);
        return String.format("Added product: %s",adminflightpost.getId());
    }
	
	 @GetMapping(path = "/admin/{adminId}")
	    public Optional<AdminFlight> getProcductById(@PathVariable String adminId){
	        return admininterface.findById(adminId);
	    }

	    @DeleteMapping(path = "/admin/{adminId}")
	    public String deleteProduct(@PathVariable String adminId){
	        admininterface.deleteById(adminId);
	        return String.format("deleted product: %s",adminId);
	    }

}
