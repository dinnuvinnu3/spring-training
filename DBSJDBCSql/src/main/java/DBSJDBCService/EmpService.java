package DBSJDBCService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbs.jdbc.template.model.Employee;
import com.dbs.jdbc.template.repository.EmpRepo;
@Service
public class EmpService {
    @Autowired
    EmpRepo empRepo;
    
    public List<Employee> findAllEmployees() {
        
        return empRepo.getAllEmployees();
        
    }
}