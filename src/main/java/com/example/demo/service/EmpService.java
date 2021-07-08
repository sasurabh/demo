package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Employ;

public interface EmpService {

	public List<Employ> getAllEmploys();
	public Employ getEmploy(int eno);
	
}
