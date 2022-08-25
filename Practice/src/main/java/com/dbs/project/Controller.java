package com.dbs.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@Autowired
Employee emp1;
@GetMapping("/Employee")
public String get(@RequestParam int id)
{
	String e = "Id is: " + emp1.getId();
	
	return e;
}

}
