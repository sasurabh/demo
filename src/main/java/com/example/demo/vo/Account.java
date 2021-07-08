package com.example.demo.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	int id;
	
	@Column(name = "accountno")
	String accountNo;
	
	String ifsc;
	int eno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNo=" + accountNo + ", ifsc=" + ifsc + ", eno=" + eno + "]";
	}
	
	
	
}
