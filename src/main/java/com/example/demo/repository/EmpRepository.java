package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.vo.Employ;

public interface EmpRepository extends CrudRepository<Employ, Integer>{
	
	public List<Employ> findAll();
	public Employ findById(int eno);
}

//c-insert r-select u-update d-delete
