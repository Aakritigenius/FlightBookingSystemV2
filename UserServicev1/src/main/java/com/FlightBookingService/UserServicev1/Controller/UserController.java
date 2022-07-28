package com.FlightBookingService.UserServicev1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingService.UserServicev1.Models.Userobject;
import com.FlightBookingService.UserServicev1.Repository.UserInterface;

@RestController
public class UserController {
	
	@Autowired
	UserInterface userinterface;
	
	@GetMapping(path = "/user")
    public List<Userobject> getUser(){
        return userinterface.findAll();
    }
	
	@PostMapping(path = "/user")
    public String addUser(@RequestBody Userobject user){
        userinterface.insert(user);
        return String.format("Added product: %s",user.getId());
    }
	//For specific notation
	 @GetMapping(path = "/user/{userid}")
	    public Optional<Userobject> getUserById(@PathVariable String userid){
	        return userinterface.findById(userid);
	    }

	    @DeleteMapping(path = "/user/{userid}")
	    public String deleteUser(@PathVariable String userid){
	        userinterface.deleteById(userid);
	        return String.format("deleted product: %s",userid);
	    }


}
