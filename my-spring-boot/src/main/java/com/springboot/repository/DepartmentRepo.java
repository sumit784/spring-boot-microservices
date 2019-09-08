package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dao.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
