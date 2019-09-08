package com.springboot.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@Column(name="add_id")
	int addId;
	
	@Column(name="add1")
	String adderss1;
	
	@Column(name="add2")
	String adderss2;
	
	@Column(name="city")
	String city;
	
	@Column(name="country")
	String country;
	
	@Column(name="landmark")
	String landmark;
	

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name="zipcode")
	int zipcode;

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAdderss1() {
		return adderss1;
	}

	public void setAdderss1(String adderss1) {
		this.adderss1 = adderss1;
	}

	public String getAdderss2() {
		return adderss2;
	}

	public void setAdderss2(String adderss2) {
		this.adderss2 = adderss2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", adderss1=" + adderss1 + ", adderss2=" + adderss2 + ", city=" + city
				+ ", country=" + country + ", landmark=" + landmark + ", zipcode=" + zipcode + ", getZipcode()="
				+ getZipcode() + ", getAddId()=" + getAddId() + ", getAdderss1()=" + getAdderss1() + ", getAdderss2()="
				+ getAdderss2() + ", getCity()=" + getCity() + ", getCountry()=" + getCountry() + ", getLandmark()="
				+ getLandmark() +  "]";
	}
	
}
