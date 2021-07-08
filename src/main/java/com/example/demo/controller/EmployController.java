package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmpService;
import com.example.demo.service.UserService;
import com.example.demo.vo.Employ;
import com.example.demo.vo.User;
import com.example.demo.vo.UserList;

@RestController
public class EmployController {
	
	private EmpService empService;
	private UserService userService;
	
	@Autowired
	public EmployController(EmpService empService, UserService userService) {
		this.empService = empService;
		this.userService = userService;
	}

	@GetMapping("/employs")
	public List<Employ>  getEmploys() {
		//List<Employ> empList = createEmploys();
		return empService.getAllEmploys();
		
	}
	
	@GetMapping("/employ/{id}")
	public ResponseEntity<Employ> getEmploy(@PathVariable int id) {
		Employ emp = empService.getEmploy(id);
		if(emp == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}else {
			return ResponseEntity.ok().body(emp);
		}
		
		
	}
	
	
	@GetMapping("/users")
	public List<User>  getUsers() {
		return userService.getUsersFromOnline();
	}

	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	 
}

//get
//post
//put
//delete
