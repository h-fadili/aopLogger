package com.aopLogger.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.aopLogger.annotations.Loggable;
import com.aopLogger.model.User;
import com.aopLogger.service.api.IUserManagementService;

@Service
public class UserManagementServiceImpl implements IUserManagementService {


	@Override
	@Loggable
	public User getUser(Long userId) {
		User u= new User();
		u.setId(userId);
		u.setFirstName("firstN");
		u.setLastName("lastN");
		u.setBirthDate(new Date());
		return u;

	}

	@Override
	@Loggable
	public Integer deleteUser(Long userId) {
		return 1;
	}


}
