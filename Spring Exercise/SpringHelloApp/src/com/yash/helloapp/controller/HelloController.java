package com.yash.helloapp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("-----Inside HelloController-----");
		String message = request.getParameter("message");
		System.out.println(message);
		
		Map<String,String> map = new HashMap(); 
		map.put("msg", message);
		return new ModelAndView("welcome",map);
	}


}
