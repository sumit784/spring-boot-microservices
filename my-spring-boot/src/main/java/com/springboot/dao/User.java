package com.springboot.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name="user_id")
	int userId;
	
	@Column(name="user_name")
	String username;
	
	@Column(name="user_pwd_plain")
	String pwdPlain;
	
	@Column(name="user_pwd_encod")
	String pwdEncod;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwdPlain() {
		return pwdPlain;
	}

	public void setPwdPlain(String pwdPlain) {
		this.pwdPlain = pwdPlain;
	}

	public String getPwdEncod() {
		return pwdEncod;
	}

	public void setPwdEncod(String pwdEncod) {
		this.pwdEncod = pwdEncod;
	}
	
	
}
