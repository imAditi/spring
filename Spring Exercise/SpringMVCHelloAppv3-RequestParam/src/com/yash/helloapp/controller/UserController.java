package com.yash.helloapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/create")
	public String create() {
		return "create"; //view Name
	}
	
	@RequestMapping(value="/store",method=RequestMethod.POST)
	public ModelAndView store(@RequestParam String name,@RequestParam String contact,@RequestParam String email) {
	System.out.println(name);
	System.out.println(contact);
	System.out.println(email);
		User user = new User();
		user.setName(name);
		user.setContact(contact);
		user.setEmail(email);
		Map<String,User> map = new HashMap();
		map.put("user",user);
		return new ModelAndView("welcome",map); //view Name
	}
	
}
