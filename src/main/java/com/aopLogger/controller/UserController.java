package com.aopLogger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aopLogger.model.User;
import com.aopLogger.service.api.IUserManagementService;

@RestController
public class UserController {

	@Autowired
	IUserManagementService userService;

	@RequestMapping("/user/{id}")
	public User searchUser(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}

	@RequestMapping("/deleteUser/{id}")
	public Integer deleteUser(@PathVariable("id") Long id) {
		return userService.deleteUser(id);
	}

}
