package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.vo.User;
import com.example.demo.vo.UserList;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<User> getUsersFromOnline() {
		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "https://gorest.co.in/public-api/users";
		ResponseEntity<UserList> response = restTemplate.getForEntity(resourceUrl, UserList.class);
		UserList userList = response.getBody();
		
		List<User> users = userList.getData();
		List<User> results = new ArrayList<>();
		
		for(User user: users) {
			if(user.getGender().equals("Male")) {
				results.add(user);
			}
		}

		
		return results;
		
	}

	
}

//Restemplate

// GET-> parameters -> LIst/object 
//post(we have to pass OBject) 
//put(we have to pass object
//delete pass parameters

// c-insert r-read  u- updat d-delete