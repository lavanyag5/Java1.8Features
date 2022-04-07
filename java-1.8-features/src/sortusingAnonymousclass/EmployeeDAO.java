package sortusingAnonymousclass;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	public List<Employee> getEmployees() {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Ajay", 30));
		emp.add(new Employee(3, "Vishnu", 17));
		emp.add(new Employee(7, "Chiru", 6));
		emp.add(new Employee(2, "Ramu", 7));
		emp.add(new Employee(4, "Latha", 45));
		return emp;

	}

}
