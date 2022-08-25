package DBSJDBCController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBSJdbcController {
    
    @Autowired
    DBSJDBCService.EmpService empService;
    
    @GetMapping("/allEmp")
    public List<DBSJDBCModel.Employee> getAllEmployees(){
        
        return empService.findAllEmployees();
        
    }
    
}