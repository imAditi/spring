package com.yash.samplespringrestdemo.dao;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;

import com.yash.samplespringrestdemo.domain.User;

/**
 * This UserDAO interface will perform all crud operation related to user
 * @author anurag.mahajan
 *
 */
public interface UserDAO {

	public User save(User user) throws NoSuchAlgorithmException,NoSuchProviderException;
	public void update(User user);
	public User delete(Integer userId);
	public void delete(User user);
	public User findById(Integer userId);
	public List<User> findAll();
	public List<User> findByProperty(String propertyName, Object propertyValue);
}
