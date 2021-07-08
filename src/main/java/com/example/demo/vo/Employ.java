package com.example.demo.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employ {

	@Id
	private int eno;
	private String ename;
	private double esalary;
	
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "eno", referencedColumnName = "eno")
	List<Address> adressList;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "eno", referencedColumnName = "eno")
	Account account;
	
	public Employ() {
		
	}
	
	public Employ(int eno, String ename, double esalary) {
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
	}


	public int getEno() {
		return eno;
	}


	public void setEno(int eno) {
		this.eno = eno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public List<Address> getAdressList() {
		return adressList;
	}

	public void setAdressList(List<Address> adressList) {
		this.adressList = adressList;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}
