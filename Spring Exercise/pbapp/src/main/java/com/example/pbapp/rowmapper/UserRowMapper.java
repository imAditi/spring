package com.example.pbapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.pbapp.domain.User;

/**
 * UserRowMapper will take input from resultSet and map each field in the user domain
 * @author aditi.jain
 *
 */
public class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user =  new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setPhone(rs.getString("phone"));
		user.setAddress(rs.getString("address"));
		user.setEmail(rs.getString("email"));
		user.setStatus(rs.getInt("status"));
		user.setRole(rs.getInt("role"));
		user.setLoginname(rs.getString("loginname"));
		user.setPassword(rs.getString("password"));
		user.setCreated_At(rs.getDate("created_At"));
		user.setUpdated_At(rs.getDate("updated_At"));

		return user;
	}



}