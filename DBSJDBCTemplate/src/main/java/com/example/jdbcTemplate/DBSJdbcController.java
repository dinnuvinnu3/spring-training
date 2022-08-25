package com.example.jdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBSJdbcController {

	@Autowired
	Employee emp;
	
	@GetMapping("/greet")
	public Employee welcome(@RequestBody Employee webEmp) {
		System.out.println("Welcome to Spring..");
		emp.setSalary(webEmp.getSalary() + 5000);
		emp.setId(webEmp.getId());
		emp.setName(webEmp.getName());
		return emp;
	}

}
