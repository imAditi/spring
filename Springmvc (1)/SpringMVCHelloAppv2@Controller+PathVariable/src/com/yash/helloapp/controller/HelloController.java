package com.yash.helloapp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloController {

	@RequestMapping("/hello/{userName}/{country}")
	public ModelAndView show(@PathVariable String userName,@PathVariable String country){
		String message ="Spring is "+ userName +" Open Source " + country;
		Map<String,String> map = new HashMap<>();
		map.put("msg", message);
		return new ModelAndView("welcome",map);
	}


}
