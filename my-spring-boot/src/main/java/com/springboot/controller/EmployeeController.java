package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.Employee;
import com.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService EmployeeService;
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		
		return EmployeeService.getAllEmployees();
		
	}
	@GetMapping("/getSelectedEmployees")
	public List<Employee> getSelectedEmployeesUsingJoin(){
		
		return EmployeeService.getSelectedEmployeesUsingJoin();
		
	}
	
	
	@PostMapping(name="/saveEmployee",
				consumes = {MediaType.ALL_VALUE, MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE , MediaType.APPLICATION_PROBLEM_XML_VALUE}, 
				produces = "application/json")
	public Employee saveEmployee(@RequestBody Employee Employee) {
		return EmployeeService.saveEmployee(Employee);
	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable(name = "id") int EmployeeId) {
		return EmployeeService.findEmployeeById(EmployeeId);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(name = "id") int EmployeeId) {
		
		EmployeeService.deleteEmployee(EmployeeId);
		
		return "Employee with Id: "+EmployeeId+" delete successfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
