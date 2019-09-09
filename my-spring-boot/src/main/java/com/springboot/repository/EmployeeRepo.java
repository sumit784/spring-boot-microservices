package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.dao.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
		
	@Procedure(procedureName = "Proc_spring")
	List<Employee> getSelectedEmployeesUsingPROC(@Param("deptId") int deptId);
	
}
