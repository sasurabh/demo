package com.example.demo.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	int id;
	String hno;
	String city;
	String pincode;
	String type;
	int eno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	
	@Override
	public String toString() {
		return "Adress [id=" + id + ", hno=" + hno + ", city=" + city + ", pincode=" + pincode + ", type=" + type
				+ ", eno=" + eno + "]";
	}
	
	
	
}
