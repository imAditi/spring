package com.example.pbapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.User;

/**
 * ContactRowMapper will take input from resultSet and map each field in the user domain
 * @author aditi.jain
 *
 */
public class ContactRowMapper implements RowMapper<Contact> {

	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact contact =  new Contact();
		contact.setId(rs.getInt("id"));
		contact.setUserid(rs.getInt("userid"));
		contact.setName(rs.getString("name"));
		contact.setPhone(rs.getString("phone"));
		contact.setAddress(rs.getString("address"));
		contact.setEmail(rs.getString("email"));
		contact.setGroup_name(rs.getString("group_name"));
		contact.setRemark(rs.getString("remark"));
		contact.setCreated_At(rs.getDate("created_At"));
		contact.setUpdated_At(rs.getDate("updated_At"));
		contact.setCreated_By(rs.getInt("created_By"));
		contact.setUpdated_By(rs.getInt("updated_By"));
		return contact;
	}

}



