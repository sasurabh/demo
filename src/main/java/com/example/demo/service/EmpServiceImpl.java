package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpRepository;
import com.example.demo.vo.Employ;

@Service
public class EmpServiceImpl implements EmpService{

	public EmpRepository empRepository;

	
	@Autowired
	public EmpServiceImpl(EmpRepository empRepository) {
		this.empRepository = empRepository;
	}
	
	@Override
	public List<Employ> getAllEmploys(){
		return empRepository.findAll();
		
	}

	@Override
	public Employ getEmploy(int eno) {
		return empRepository.findById(eno);
	}


}
