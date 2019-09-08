package com.springboot.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;

import com.springboot.dao.Employee;
import com.springboot.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

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
	EmployeeRepo EmployeeRepo;
	
	
	@Override
	public List<Employee> getSelectedEmployeesUsingJoin(){
		
		return EmployeeRepo.getSelectedEmployeesUsingJoin();
		
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return EmployeeRepo.findAll();
		
		
	}

	@Override
	public Employee saveEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		return EmployeeRepo.save(Employee);
	}

	@Override
	public void deleteEmployee(int id) {
		Employee Employee = findEmployeeById(id);
		if(Employee!=null) {
			
			EmployeeRepo.delete(Employee);
		}
		
		
	}

	@Override
	public Employee updateEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		return EmployeeRepo.saveAndFlush(Employee);
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return  EmployeeRepo.findById(id).get();
	}

	

}
