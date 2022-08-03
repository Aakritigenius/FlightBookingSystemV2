package com.FlightBookingService.CheckinService.Controller;

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
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingService.CheckinService.Models.CheckinObject;
import com.FlightBookingService.CheckinService.Repository.CheckinInterface;
@RestController
@RequestMapping("/api/version1")
public class CheckinController {
	
	@Autowired
	CheckinInterface checkininterface;
	
	@GetMapping(path="/checkin")
    public List<CheckinObject> getcheckedInList(){
        return checkininterface.findAll();
    }
	
	@PostMapping(path = "/checkin")
    public String AddChecked(@RequestBody CheckinObject checkin){
        checkininterface.insert(checkin);
        return String.format("Added checked ticket: %s",checkin.getId());
    }
	
	 @GetMapping(path = "/checkin/{checkedId}")
	    public Optional<CheckinObject> getCheckedListById(@PathVariable String checkedId){
	        return checkininterface.findById(checkedId);
	    }
	 @PutMapping(path = "/checkin/{checkedid}")
	 public String updatebookingList(@PathVariable String checkedid,@RequestBody CheckinObject object) {
	      object.setId(checkedid);
	      checkininterface.save(object);
		  return String.format("Updated Admin user:%s", object.getId());                                            
	 }

	    @DeleteMapping(path = "/checkin/{checkedid}")
	    public String deleteCheckedList(@PathVariable String checkedid){
	        checkininterface.deleteById(checkedid);
	        return String.format("deleted CheckedList: %s",checkedid);
	    }

}
