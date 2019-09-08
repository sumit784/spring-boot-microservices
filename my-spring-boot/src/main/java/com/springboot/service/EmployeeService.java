package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.dao.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee findEmployeeById(int id);
	public Employee saveEmployee(Employee Employee);
	public Employee updateEmployee(Employee Employee);
	void deleteEmployee(int id);
	
//	List<Employee> getSelectedEmployees();
	List<Employee> getSelectedEmployeesUsingJoin();
	
	

}
