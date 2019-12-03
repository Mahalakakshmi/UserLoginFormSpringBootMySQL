package com.convas8.userdto;

import com.canvas8.entity.User;

public interface UserDao {
	public String add(User user);
	public String update(User user);
	public String deleted(User userId);

}
