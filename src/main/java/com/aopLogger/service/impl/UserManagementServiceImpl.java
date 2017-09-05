package com.aopLogger.service.impl;

import com.aopLogger.annotations.Loggable;
import com.aopLogger.model.User;
import com.aopLogger.service.api.IUserManagementService;

public class UserManagementServiceImpl implements IUserManagementService {

	@Override
	@Loggable
	public void addUser(User user) {
		System.out.println("User added!");

	}

	@Override
	@Loggable
	public User getUser(Long userId) {
		System.out.println("User searched!");
		return new User();

	}

	@Override
	@Loggable
	public void deleteUser(Long userId) {
		System.out.println("User deleted!");

	}

	@Override
	@Loggable
	public void updateUser(User user) {
		System.out.println("User updated!");

	}

}
