package com.canvas8.service;

import com.canvas8.entity.User;

public interface UserService {

	public  String addUser(User user) ;
	public String updateUser(User user);
	public String deleteUser(User userId);
	
	
}
