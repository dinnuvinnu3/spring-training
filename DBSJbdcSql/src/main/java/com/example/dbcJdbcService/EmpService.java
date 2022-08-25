package com.example.dbcJdbcService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dbcJdbcModel.Employee;
import com.example.dbsJdbcRepository.EmpRepo;
@Service
public class EmpService {
    @Autowired
    EmpRepo empRepo;
    
    public List<Employee> findAllEmployees() {
        
        return empRepo.getAllTheEmployees();
        
    }

//	public String insertEmpRec(Employee emp) {
//		String res = empRepo.additionOfRecords(emp);
//		return res;
//	}
}