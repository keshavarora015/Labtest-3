package com.tmgt.model.service;

import com.tmgt.userdao.User;
import com.tmgt.userdao.UserDao;
import com.tmgt.userdao.UserDaoImpl;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public void addUser(User user) {
		 userDao.addUser(user);
	}

	@Override
	public User getUser(String username, String password) {
		return userDao.getUser(username,password);
	}
	
}
