package com.jdbc.service;

import java.util.List;

import com.jdbc.entity.User;

public interface UserService {
	
	public int registerUser(User user);
	public List<User> getAllUsers();
	public int updateUserDetails(User user);
    public int deleteUserById(int userId);
    public User getUserById(int id);

}
