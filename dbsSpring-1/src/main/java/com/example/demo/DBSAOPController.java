package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBSAOPController {
	@Autowired
	DBSBusinessLogic dBSBusinessLogic;
	
	@GetMapping("/hyd/dbs")
	public void dbs() {
		dBSBusinessLogic.logic();
	}

}
