package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dao.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {
}
