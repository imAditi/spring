package com.yash.helloapp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class HelloController {

	@RequestMapping("/hello.ds")
	public ModelAndView show(){
		String message ="Spring is Open Source";
		Map<String,String> map = new HashMap<>();
		map.put("msg", message);
		return new ModelAndView("welcome",map);
	}


}
