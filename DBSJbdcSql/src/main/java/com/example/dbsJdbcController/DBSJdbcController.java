package com.example.dbsJdbcController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dbcJdbcModel.Employee;
import com.example.dbcJdbcService.EmpService;
@RestController
public class DBSJdbcController {
    
    @Autowired
    EmpService empService;
    
    @GetMapping("/allTheEmp")
    public List<Employee> getAllEmployees(){
        
        return empService.findAllEmployees();
        
    }
    
//    @PostMapping("/insertEmp")
//    public String addEmpRec(@RequestBody Employee emp) {
//    	String result = empService.insertEmpRec(emp);
//    	return result;
//    }
    
    
}