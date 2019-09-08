package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.dao.Department;

public interface DepartmentService {
	
	public List<Department> getAllDepartments();
	public Department findDepartmentById(int id);
	public Department saveDepartment(Department Department);
	public Department updateDepartment(Department Department);
	void deleteDepartment(int id);
	
	

}
