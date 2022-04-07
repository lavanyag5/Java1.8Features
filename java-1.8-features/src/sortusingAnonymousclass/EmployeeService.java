package sortusingAnonymousclass;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

	public List<Employee> getEmployeeInSort() {
		List<Employee> emp = new EmployeeDAO().getEmployees();
		Collections.sort(emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				// Ascending order
				return e1.getName().compareTo(e2.getName());

				// Descending order
				// return e2.getName().compareTo(e1.getName());

			}
		});
		return emp;
	}

	public static void main(String[] args) {
		EmployeeService emp = new EmployeeService();
		System.out.println(emp.getEmployeeInSort());

	}

}
