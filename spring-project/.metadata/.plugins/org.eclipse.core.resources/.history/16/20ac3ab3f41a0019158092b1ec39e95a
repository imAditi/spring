package com.yash.samplespringrestdemo.resource;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.samplespringrestdemo.command.LoginCommand;
import com.yash.samplespringrestdemo.command.RegistrationCommand;
import com.yash.samplespringrestdemo.domain.Contact;
import com.yash.samplespringrestdemo.domain.User;
import com.yash.samplespringrestdemo.exception.BlockUserException;
import com.yash.samplespringrestdemo.exception.UserAlreadyExistException;
import com.yash.samplespringrestdemo.service.ContactService;
import com.yash.samplespringrestdemo.service.UserService;
import com.yash.samplespringrestdemo.serviceimpl.MapValidationErrorService;

@RestController
@CrossOrigin
public class UserResource {

	@Autowired
	private UserService userservice;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@Autowired
	private ContactService contactservice;
	


	@GetMapping("/listContact")
	private List<Contact> listContact(HttpSession session) {
		
		 List<Contact> contacts = contactservice.findUserContact((Integer)session.getAttribute("userid"));
		session.setAttribute("contacts", contacts);
		 return contacts;

	}

	@GetMapping("/user/listUser")
	private  ResponseEntity<?> listUser(HttpSession session) {
		Iterable<User> users = userservice.getUserList();
	//	session.setAttribute("users", users);
		 return new ResponseEntity(users, HttpStatus.OK);

	}
	
	
	@PostMapping("/user")
	public ResponseEntity<?> createUser(@Valid @RequestBody User user,BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		try {
			userservice.register(user);
		} catch (UserAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@GetMapping("/user/listUser/{userId}")
	public ResponseEntity<?> getUserByRecordNumber(@PathVariable("userId") int userId) {
		User user = userservice.findByUserId(userId);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@DeleteMapping("/user/listUser/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable("userId") int userId) {
		userservice.deleteUser(userId);
		return new ResponseEntity<String>("User ID  : '"+userId+"' Deleted Successfully!!",HttpStatus.OK);
	}
}
