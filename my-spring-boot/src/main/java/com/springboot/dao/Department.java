package com.springboot.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {

	@Id
	@Column(name="dept_id")
	int deptId;
	
	@Column(name="dept_name")
	String deptName;
		
	@Column(name="dept_head")
	String deptHead;
	
	@Column(name="dept_contact")
	String deptContact;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptHead() {
		return deptHead;
	}

	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

	public String getDeptContact() {
		return deptContact;
	}

	public void setDeptContact(String deptContact) {
		this.deptContact = deptContact;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptHead=" + deptHead + ", deptContact="
				+ deptContact + ", getDeptId()=" + getDeptId() + ", getDeptName()=" + getDeptName() + ", getDeptHead()="
				+ getDeptHead() + ", getDeptContact()=" + getDeptContact()  + "]";
	}
	
	

	
}
