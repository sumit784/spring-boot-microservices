package com.springboot.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;

import com.springboot.dao.Department;
import com.springboot.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

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
	DepartmentRepo DepartmentRepo;
	
		
	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return DepartmentRepo.findAll();
		
		
	}

	@Override
	public Department saveDepartment(Department Department) {
		// TODO Auto-generated method stub
		return DepartmentRepo.save(Department);
	}

	@Override
	public void deleteDepartment(int id) {
		Department Department = findDepartmentById(id);
		if(Department!=null) {
			
			DepartmentRepo.delete(Department);
		}
		
		
	}

	@Override
	public Department updateDepartment(Department Department) {
		// TODO Auto-generated method stub
		return DepartmentRepo.saveAndFlush(Department);
	}

	@Override
	public Department findDepartmentById(int id) {
		// TODO Auto-generated method stub
		return  DepartmentRepo.findById(id).get();
	}

	

}
