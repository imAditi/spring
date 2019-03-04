package com.example.ppmtool.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ppmtool.domain.Project;
import com.example.ppmtool.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
private ProjectRepository projectRepository;
	public Project saveOrUpdate(Project project) {
		//Logic
		return projectRepository.save(project);
	}
	public void delete(Long id) {
		 projectRepository.deleteById(id);	
	}
	public Project saveOrUpdate(Long id,Project project) {
		Project tempProject=projectRepository.findById(id).get();
		tempProject=project;
		return projectRepository.save(tempProject);
	}
	public List<Project> getAllProjects() {
			List<Project> list = new ArrayList<>();
			projectRepository.findAll().forEach(e -> list.add(e));
			return list;
	}
}
