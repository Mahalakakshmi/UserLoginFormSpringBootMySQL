package com.convas8.userdto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.canvas8.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	
	 @Autowired
	 JdbcTemplate  jdbcTemplate;

	@Override
	public String add(User user) {
		int rowCount = jdbcTemplate.update("insert into userinfo values( "+"user.getFirstname()"+','+"user.getLastname() "+','+
				 "user.getCorporategroupid()"+  ""
				 		+ "user.getEmail()"+   "user.getPassword()"+  "user.getCreatedDate()"+ "user.getExpiryDate()"+ "user.getPostcode()"+")");
		
		return null;
	}

	@Override
	public String update(User user) {
		
		
		return null;
	}

	@Override
	public String deleted(User userId) {
		
		return null;
	}

}
