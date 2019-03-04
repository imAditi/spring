package com.yash.helloapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

	@ModelAttribute
	public void commonHeader(Model model) {
		model.addAttribute("commonMessage","This is Spring App");
	}
	
	
	@RequestMapping("/create")
	public String create() {
		return "create"; //view Name
	}
	
/*	@RequestMapping(value="/store",method=RequestMethod.POST)
	public String store(@ModelAttribute User user,Model model) {
		model.addAttribute("user", user);
		return "welcome"; //view Name
	}
	*/
	@RequestMapping(value="/store",method=RequestMethod.POST)
	public String store(@ModelAttribute User user) {
		return "welcome"; //view Name
	}
	
	

}
