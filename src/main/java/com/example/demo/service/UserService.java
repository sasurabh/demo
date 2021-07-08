package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.User;
import com.example.demo.vo.UserList;

public interface UserService {

	List<User> getUsersFromOnline();
}
