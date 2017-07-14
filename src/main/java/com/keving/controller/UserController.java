package com.keving.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.keving.model.User;
import com.keving.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("find/{id}")
	@ResponseBody
	public User find(@PathVariable Integer id){
		User user = userService.findById(id);
		return user;
		
	}
}
