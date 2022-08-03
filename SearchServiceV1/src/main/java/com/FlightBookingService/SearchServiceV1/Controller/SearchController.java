package com.FlightBookingService.SearchServiceV1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingService.SearchServiceV1.Models.SearchObject;
import com.FlightBookingService.SearchServiceV1.Repository.SearchInterface;

@RestController
@RequestMapping("/api/version1/")
public class SearchController {
	
	@Autowired
	SearchInterface searchinterface;
	
	@GetMapping("/search")
    public List<SearchObject> getsearchresults(){
        return searchinterface.findAll();
    }
	
	@PostMapping(path = "/search")
    public String addsearchcontent(@RequestBody SearchObject search){
        searchinterface.insert(search);
        return String.format("Added searchcontent: %s",search.getId());
    }
	//For specific notation
	 @GetMapping(path = "/search/{searchid}")
	    public Optional<SearchObject> getsearchresultsById(@PathVariable String searchid){
	        return searchinterface.findById(searchid);
	    }

//	    @DeleteMapping(path = "/user/{userid}")
//	    public String deleteUser(@PathVariable String userid){
//	        userinterface.deleteById(userid);
//	        return String.format("deleted product: %s",userid);
//	    }


}
