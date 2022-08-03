package com.FlightBookingServices.AdminServicesV2.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.FlightBookingServices.AdminServicesV2.Models.AdminObject;
import com.FlightBookingServices.AdminServicesV2.Repository.AdminRepository;

@RestController
@RequestMapping("/api/version1")
public class AdminController {
   @Autowired
   AdminRepository adminrepository;
   
   @GetMapping("/Admin")
	public List<AdminObject> getAllbookings(){
		return adminrepository.findAll();
	}
	@PostMapping(path = "/Admin")
   public String addProduct(@RequestBody AdminObject login){
       adminrepository.insert(login);
       return String.format("Added Admin user: %s",login.getName());
   }
	
	 @GetMapping(path = "/Admin/{adminid}")
	    public Optional<AdminObject> getProcductById(@PathVariable String adminid){
	        return adminrepository.findById(adminid);
	    }
	 
	 @PutMapping(path = "/Admin/{adminid}")
	 public String updateadminList(@PathVariable String adminid,@RequestBody AdminObject object) {
	      object.setId(adminid);
	      adminrepository.save(object);
		  return String.format("Updated Admin user:%s", object.getName());                                            
	 }
	   

	    @DeleteMapping(path = "/admin/{adminid}")
	    public String deleteProduct(@PathVariable String adminid){
	        adminrepository.deleteById(adminid);
	        return String.format("deleted user: %s",adminid);
	    }
   
}
