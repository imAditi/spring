package com.yash.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yash.model.Student;

@Controller
@RequestMapping("/")
public class StudentController {

	/**
	 * This method will serve as default GET handler
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "enroll";
	}
	/**
	 * This method will be called on form submission,handling POST request
	 * It also validates the user input
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String saveRegistration(@Valid Student student,BindingResult result,ModelMap model) {
		if(result.hasErrors()) {
			return "enroll";
		}
		model.addAttribute("success","dear"+student.getFirstName()+", your registration completed successfully");
		return "success";
	}
	/**
	 * Method used to populate section list in view.Note that here you
	 * can call external systems to provide real data
	 */
	@ModelAttribute("sections")
	public List<String> initializeSections(){
		List<String> sections = new ArrayList<String>();
		sections.add("Graduate");
		sections.add("post graduate");
		sections.add("research");
		
		return sections;
	}
	/**
	 * Method used to populate the country list in view.Note here you can call 
	 * external systems to provide real data
	 */
	@ModelAttribute("countries")
	public List<String> initializeCountries(){
		List<String> countries = new ArrayList<String>();
		countries.add("INDIA");
		countries.add("USA");
		countries.add("UAE");
		countries.add("GERMANY");
		countries.add("ITALY");
		countries.add("OTHER");
		return countries;
	}
	/**
	 * Method used to populate the subjects list in view.Note here you can call 
	 * external systems to provide real data
	 */
	@ModelAttribute("subjects")
	public List<String> initializeSubjects(){
		List<String> subjects = new ArrayList<String>();
		subjects.add("PHYSICS");
		subjects.add("CHEMISTRY");
		subjects.add("LIFE SCIENCE");
		subjects.add("POLITICAL SCIENE");
		subjects.add("COMPUTER SCIENCE");
		subjects.add("MATHEMATICS");
		return subjects;
	}
	
}
