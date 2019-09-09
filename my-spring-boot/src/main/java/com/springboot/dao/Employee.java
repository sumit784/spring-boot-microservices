package com.springboot.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="emp_id")
	int empId;
	
	@Column(name="emp_name")
	String empName;
	
	@Column(name="emp_dep")
	int empDept;
	
	@Column(name="emp_address")
	int empAddress;
	
	@Column(name="emp_contact")
	String empContact;
	
	@Column(name="emp_email")
	String empEmail;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpDept() {
		return empDept;
	}

	public void setEmpDept(int empDept) {
		this.empDept = empDept;
	}

	public int getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(int empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empAddress="
				+ empAddress + ", empContact=" + empContact + ", empEmail=" + empEmail + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName() + ", getEmpDept()=" + getEmpDept() + ", getEmpAddress()="
				+ getEmpAddress() + ", getEmpContact()=" + getEmpContact() + ", getEmpEmail()=" + getEmpEmail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
