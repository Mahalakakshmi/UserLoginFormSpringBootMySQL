package com.convas8.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.canvas8.entity.User;
import com.canvas8.service.UserService;


@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = "/welcome" , method = RequestMethod.GET )
	public String showWelcomePage(){
			return "index";
	}
	
	
	@RequestMapping(value = "/user" , method = RequestMethod.GET )
	public String showregistrationPage(){
	//public String showUserInfo(WebRequest request, Model model){
		//UserDto userDto = new UserDto();
	  //  model.addAttribute("user", userDto);
		return "user";
	}
	
	@RequestMapping(value = "/add" , method = RequestMethod.POST )
	public String add(ModelMap  map ,@RequestParam  String firstname ,@RequestParam  String lastname,@RequestParam  int corporategpid,
			@RequestParam  String email, @RequestParam  String password,@RequestParam  Date createddate,@RequestParam  Date expirydate,@RequestParam  String postcode	) {
		
		map.addAttribute("UserOperation", "User Insertion");
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setCorporategroupid(corporategpid);
		user.setEmail(email);
		user.setPassword(password);
		user.setCreatedDate(createddate);
		user.setExpiryDate(expirydate);
		user.setPostcode(postcode);
		
		String status= UserService.addUser(user);
		//String status="";
		
		return  status;
		
	}
	

}
