package com.FlightBookingService.FareServicev1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingService.FareServicev1.Models.FareObject;
import com.FlightBookingService.FareServicev1.Repository.FareInterface;

@RestController
public class Farecontroller {
 
	@Autowired
	FareInterface fareinterface;
	
	@GetMapping(path = "/fare")
    public List<FareObject> getProducts(){
        return fareinterface.findAll();
    }
	
	@PostMapping(path = "/fare")
    public String addProduct(@RequestBody FareObject paymentgateway){
        fareinterface.insert(paymentgateway);
        return String.format("Added payment: %s",paymentgateway.getId());
    }
	
	 @GetMapping(path = "/fare/{fareid}")
	    public Optional<FareObject> getProcductById(@PathVariable String fareid){
	        return fareinterface.findById(fareid);
	    }

//	    @DeleteMapping(path = "/fare/{fareid}")
//	    public String deleteProduct(@PathVariable String fareid){
//	        fareinterface.deleteById(fareid);
//	        return String.format("deleted product: %s",fareid);
//	    }
	
}
