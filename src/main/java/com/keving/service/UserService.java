package com.keving.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keving.dao.UserDao;
import com.keving.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User findById(Integer id) {
		User user = userDao.findById(id);
		return user;
	}

}
