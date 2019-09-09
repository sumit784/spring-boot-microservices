package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.dao.User;
import com.springboot.repository.UserRepo;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 
		User user = userRepo.findByUsername(username);
		
		if(user==null) {
			
			throw new UsernameNotFoundException("Username do not exist");
		}
		
		return new AppUser(user);
	}

}
