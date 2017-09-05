package com.aopLogger.service.api;

import com.aopLogger.model.User;

public interface IUserManagementService {
	
	void addUser(User user);
	User getUser(Long userId);
	void deleteUser(Long userId);
	void updateUser(User user); 

}
