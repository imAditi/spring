package com.yash.helloapp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

	@RequestMapping("/hello.ds")
	public ModelAndView hello() {
		String message="This is Hello Greeting Controller";
		Map<String,String> map = new HashMap<>();
		map.put("msg", message);
		return new ModelAndView("welcome",map);
	}
	@RequestMapping("/hi.ds")
	public ModelAndView hi() {
		String message="This is Hi Greeting Controller";
		Map<String,String> map = new HashMap<>();
		map.put("msg", message);
		return new ModelAndView("welcome",map);
	}
}
