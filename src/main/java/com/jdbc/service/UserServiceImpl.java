package com.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbc.dao.UserDao;
import com.jdbc.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public int registerUser(User user) {
		int i=userDao.saveUser(user);
		return i;
	}
	
	 public int updateUserDetails(User user) {
	        return userDao.updateDetails(user);
	    }
	 
	 public int deleteUserById(int userId) {
	        if (userId <= 0) {
	            throw new IllegalArgumentException("Invalid user ID.");
	        }
	        return userDao.delete(userId);
	    }
	 
	public List<User> getAllUsers() {
        return userDao.getAllUser();
    }
	
	public User getUserById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid user ID.");
        }
        return userDao.getUserById(id);
    }

}
