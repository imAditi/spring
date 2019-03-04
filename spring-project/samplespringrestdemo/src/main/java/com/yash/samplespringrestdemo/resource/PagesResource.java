package com.yash.samplespringrestdemo.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesResource {

	@RequestMapping(value={"/","/index"})
	private String index() {
		return "Hello";

	}
	@RequestMapping(value={"/about"})
	private String about() {
		return "about";

	}
	@RequestMapping(value={"/contact"})
	private String contact() {
		return "contact";

	}
}
