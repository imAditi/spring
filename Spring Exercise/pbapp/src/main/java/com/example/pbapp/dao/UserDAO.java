package com.example.pbapp.dao;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;

import com.example.pbapp.domain.User;

/**
 * This UserDAO interface will perform CRUD operations related to user
 * 
 * @author aditi.jain
 *
 */
public interface UserDAO {
	public void save(User user) throws NoSuchAlgorithmException, NoSuchProviderException;

	public void update(User user);

	public void delete(int userId);

	public void delete(User user);

	public User findById(int userId);

	public List<User> findAll();

	public List<User> findByProperty(String propertyName, Object propertyValue);
}
