package com.tmgt.model.service;

import com.tmgt.userdao.User;

public interface UserService {
	public void addUser(User user);
	public User getUser(String username,String password);
}
