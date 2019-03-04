package com.example.ppmtool.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ppmtool.domain.Project;
import com.example.ppmtool.service.ProjectService;

@RestController
@RequestMapping("/web/projects")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@PostMapping("")
	public ResponseEntity<?> createProject(@Valid @RequestBody Project project, BindingResult result) {
		if(result.hasErrors()) {
			Map<String, String> errMap = new HashMap<>();
			for(FieldError fieldError : result.getFieldErrors()) {
				errMap.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errMap, HttpStatus.BAD_REQUEST);
		}
		projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Project> deleteProject(@PathVariable Long id) {
		projectService.delete(id);
		return new ResponseEntity<Project>(HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Project> updateProject(@PathVariable Long id,@RequestBody Project project) {
		projectService.saveOrUpdate(id,project);
		return new ResponseEntity<Project>(project,HttpStatus.OK);
	}
	@GetMapping("")
	public ResponseEntity<List<Project>> getAllProjects() {
		List<Project> project = projectService.getAllProjects();
		return new ResponseEntity<List<Project>>(project, HttpStatus.OK);
	}
}
