package com.yash.samplespringrestdemo.serviceimpl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.yash.samplespringrestdemo.dao.BaseDAO;
import com.yash.samplespringrestdemo.dao.UserDAO;
import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.exception.BlockUserException;
import com.yash.samplespringrestdemo.exception.UserAlreadyExistException;
import com.yash.samplespringrestdemo.exception.UserIdException;
import com.yash.samplespringrestdemo.rowmapper.UserRowMapper;
import com.yash.samplespringrestdemo.service.UserService;
import com.yash.samplespringrestdemo.util.SecurePasswordUtil;

@Service
public class UserServiceImpl extends BaseDAO implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	public User register(User user) throws UserAlreadyExistException {
		
		try {
			userDAO.save(user);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		}
		return user;
	}

	public User login(String loginname, String password) throws BlockUserException {
		
		String securePassword = SecurePasswordUtil.getSecurePassword(password);
		String sql = "select * from users where loginname=:loginname and password=:password";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("loginname", loginname);
		params.put("password", securePassword);
		try {
			User user = getNamedParameterJdbcTemplate().queryForObject(sql,params, new UserRowMapper());
			if(user.getStatus().equals(UserService.USER_STATUS_BLOCKED)) {
				throw new BlockUserException("You are blocked. Contact admin for more information");
			} else {
			return user;
			}
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public Iterable<User> getUserList() {
		
		return userDAO.findAll();
	}

	public void changeLoginStatus(Integer userId, Integer loginStatus) {
		User user = userDAO.findById(userId);
		user.setStatus(loginStatus);
		userDAO.update(user);
	}
	public User findByUserId(Integer userId) {
	
		User user = userDAO.findById(userId);
		if(user==null) {
			throw new UserIdException("User Id : '"+userId+ "' does not exist!!");
		}
		return user;
	}

	public User deleteUser(Integer userId) {
		
		return userDAO.delete(userId);
	}

}
