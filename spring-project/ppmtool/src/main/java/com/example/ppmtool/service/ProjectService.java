package com.example.ppmtool.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ppmtool.domain.Project;
import com.example.ppmtool.exception.ProjectIdException;
import com.example.ppmtool.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	public Project saveOrUpdate(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		} catch (Exception ex) {
			throw new ProjectIdException("Project id : " + project.getProjectIdentifier() + " already exists");
		}
	}

	public Project findByProjectIdentifier(String projectIdentifier) {
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if (project == null) {
			throw new ProjectIdException("Project ID :" + projectIdentifier.toUpperCase() + "does not exist");
		}
		return project;
	}

	public Iterable<Project> findAllProjects() {
		return projectRepository.findAll();
	}

	public void deleteProjectByProjectIdentifier(String projectIdentifier) {
		Project project = projectRepository.findByProjectIdentifier(projectIdentifier.toUpperCase());
		if (project == null) {
			throw new ProjectIdException("Project ID :" + projectIdentifier.toUpperCase() + "does not exist");
		}
		projectRepository.deleteById(project.getId());
	}
	public Project saveOrUpdate(Long id, Project project) {
        Project tempproject = projectRepository.findById(id).get();
        tempproject=project;
        return projectRepository.save(tempproject);
        
    }

}
