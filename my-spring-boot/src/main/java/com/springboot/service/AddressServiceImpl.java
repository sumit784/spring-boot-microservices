package com.springboot.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;

import com.springboot.dao.Address;
import com.springboot.repository.AddressRepo;

@Service
public class AddressServiceImpl implements AddressService {

	/*
	@Autowired
	LocalContainerEntityManagerFactoryBean entityManagerFactoryBean;
	
	
	public Session getSession() {
		
		Session session = entityManagerFactoryBean.getCurrentSession();
		if(session == null) {
			session = sessionFactory.openSession();
		}
		
		return session;
	}
	*/
	
	@Autowired
	AddressRepo AddressRepo;
	
		
	@Override
	public List<Address> getAllAddresss() {
		// TODO Auto-generated method stub
		return AddressRepo.findAll();
		
		
	}

	@Override
	public Address saveAddress(Address Address) {
		// TODO Auto-generated method stub
		return AddressRepo.save(Address);
	}

	@Override
	public void deleteAddress(int id) {
		Address Address = findAddressById(id);
		if(Address!=null) {
			
			AddressRepo.delete(Address);
		}
		
		
	}

	@Override
	public Address updateAddress(Address Address) {
		// TODO Auto-generated method stub
		return AddressRepo.saveAndFlush(Address);
	}

	@Override
	public Address findAddressById(int id) {
		// TODO Auto-generated method stub
		return  AddressRepo.findById(id).get();
	}

	

}
