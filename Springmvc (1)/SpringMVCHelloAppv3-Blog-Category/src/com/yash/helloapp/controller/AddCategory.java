package com.yash.helloapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.helloapp.pojo.Blog;

@Controller
@RequestMapping("/user")
public class AddCategory {

	@ModelAttribute
	public void commonHeader(Model model) {
		model.addAttribute("commonMessage","Welcome!! This is Blog App!!");
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
	public String store(@ModelAttribute Blog blog,Model model) {
		System.out.println(blog.getCategory().size());
		model.addAttribute(blog);
		return "welcome"; //view Name
	}
}
