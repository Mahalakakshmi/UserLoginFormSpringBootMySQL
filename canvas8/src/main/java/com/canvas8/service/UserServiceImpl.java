package com.canvas8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canvas8.entity.User;
import com.convas8.userdto.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserDao userDao;

	@Override
	public String addUser(User user) {
		String status = userDao.add(user);
		
		return status;
	}

	@Override
	public String updateUser(User user) {
		
		return null;
	}

	@Override
	public String deleteUser(User userId) {
		
		return null;
	}

}
