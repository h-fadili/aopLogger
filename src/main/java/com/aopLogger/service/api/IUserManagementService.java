package com.aopLogger.service.api;

import com.aopLogger.model.User;

public interface IUserManagementService {
	
	User getUser(Long userId);
	
	Integer deleteUser(Long userId);

}
