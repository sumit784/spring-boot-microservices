package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.dao.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
	@Query("FROM Employee")
	List<Employee> getSelectedEmployeesUsingJoin();
	
}
