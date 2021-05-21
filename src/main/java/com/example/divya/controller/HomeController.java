package com.example.divya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.divya.entities.RfidData;
import com.example.divya.services.RfidService;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController      // send data in json or xml format
public class HomeController {     

	@Autowired //object of rfidservice by loose coupling
	private RfidService rfidservices;
	
	//mapping or method
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	//get the ids
  
	@GetMapping("/tagids")
	public List<RfidData> getDatas(){
				
		return this.rfidservices.getRfidDatas();
	}
	
	//single id fetchS
	@GetMapping("/tagids/{tagId}")
	public RfidData getDatas(@PathVariable String tagId) {
		return this.rfidservices.getRfidData(Integer.parseInt(tagId));
	}
	
	//Add new id api
	@PostMapping("/tagids")
	public RfidData addRfidData(@RequestBody RfidData rfidData) {
	 
		return this.rfidservices.addRfidData(rfidData);
	}
	
}
