package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.Department;
import com.springboot.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentService DepartmentService;
	
	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartments(){
		
		return DepartmentService.getAllDepartments();
		
	}
	
	@GetMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department Department) {
		return DepartmentService.saveDepartment(Department);
	}

	@GetMapping("/getDepartment")
	public Department getDepartment(@RequestParam int DepartmentId) {
		return DepartmentService.findDepartmentById(DepartmentId);
	}
	
	@GetMapping("/deleteDepartment")
	public String deleteDepartment(@RequestParam int DepartmentId) {
		
		DepartmentService.deleteDepartment(DepartmentId);
		
		return "Department with Id: "+DepartmentId+" delete successfully";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
