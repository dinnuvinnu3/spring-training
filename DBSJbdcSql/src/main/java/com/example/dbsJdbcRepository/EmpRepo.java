package com.example.dbsJdbcRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.example.dbcJdbcModel.Employee;
@Repository
public class EmpRepo {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    
    
    RowMapper<Employee> mapRower = (resSet,num)->{
        Employee emp = new Employee();
        
        emp.setId(resSet.getInt(1));
        emp.setName(resSet.getString(2));
        emp.setSalary(resSet.getInt(3));
        
        return emp;
    };
    public List<Employee>  getAllTheEmployees() {
    
        List<Employee> empList = jdbcTemplate.query("SELECT * FROM EMPLOYEE", mapRower);
        return empList;
        
    }
//	public String additionOfRecords(Employee emp) {
//		String response = "";
//        
//        String insertQuery = "INSERT INTO EMPLOYEE(name, salary) VALUES (?, ?)";
//                
//        int numRec = jdbcTemplate.update(insertQuery, emp.getName(), emp.getSalary());
//        
//        if(numRec > 0) {
//            
//            response = "One record got added ";
//        }
//        else {
//            response = "Problem occured while adding new record!!!!!!!!!!!! ";
//        }
//        
//        return response;
//	}
}