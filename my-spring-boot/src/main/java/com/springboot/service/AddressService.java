package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.dao.Address;

public interface AddressService {
	
	public List<Address> getAllAddresss();
	public Address findAddressById(int id);
	public Address saveAddress(Address Address);
	public Address updateAddress(Address Address);
	void deleteAddress(int id);
	
	

}
