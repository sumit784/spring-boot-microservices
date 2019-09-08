package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.Address;
import com.springboot.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService AddressService;
	
	@GetMapping("/getAllAddresss")
	public List<Address> getAllAddresss(){
		
		return AddressService.getAllAddresss();
		
	}
	
	@GetMapping("/saveAddress")
	public Address saveAddress(@RequestBody Address Address) {
		return AddressService.saveAddress(Address);
	}

	@GetMapping("/getAddress")
	public Address getAddress(@RequestParam int AddressId) {
		return AddressService.findAddressById(AddressId);
	}
	
	@GetMapping("/deleteAddress")
	public String deleteAddress(@RequestParam int AddressId) {
		
		AddressService.deleteAddress(AddressId);
		
		return "Address with Id: "+AddressId+" delete successfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
