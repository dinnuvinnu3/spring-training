package com.dbs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.project.model.ProjectInfo;
import com.dbs.project.service.ProjectService;

@RestController
@CrossOrigin("*")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	@GetMapping("/")
	public List<ProjectInfo> getDetails() {
		return projectService.findAllDetails();
	}

	
	@GetMapping("/details")
	public List<String> checkCustomerId(@RequestParam String custId) {
		return projectService.validCustomerId(custId);
	}
	
	@GetMapping("/checkOverdraft")
	public Boolean checkForOverDraft(@RequestParam int balance, @RequestParam String custId) {
		return !projectService.ValidateOverDraft(balance, custId)?false : true;
	}

}
