package DBSJDBCRepository;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.jdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import DBSJDBCModel.Employee;
//import com.dbs.jdbc.template.model.Employee;
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
    public List<Employee>  getAllEmployees() {
    
        List<Employee> empList = jdbcTemplate.query("SELECT * FROM EMP ", mapRower);
        
        return empList;
        
    }
}
