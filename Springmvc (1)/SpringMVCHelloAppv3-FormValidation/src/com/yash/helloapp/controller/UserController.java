package com.yash.helloapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yash.helloapp.pojo.User;


@Controller
@RequestMapping("/user")
public class UserController {

	@ModelAttribute
	public void commonHeader(Model model) {
		model.addAttribute("commonMessage","Welcome!! This is Spring App!!");
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
	
	@InitBinder
	private void initbin(WebDataBinder webDataBinder) {
		webDataBinder.setDisallowedFields(new String[] {"contact"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy***mm***dd");
		webDataBinder.registerCustomEditor(Date.class, "joining",new CustomDateEditor(dateFormat,true));
	}
	
	@RequestMapping(value="/store",method=RequestMethod.POST)
	public String store(@Valid @ModelAttribute User user,BindingResult result) {
		if(result.hasErrors()) {
			return "create";
		}
		return "welcome"; //view Name
	}
	
	

}
