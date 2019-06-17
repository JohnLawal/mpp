package prob7.prob7b;

import java.util.List;
import java.util.stream.Collectors;

import prob7.prob7a.Employee;

public class LambdaLibrary {

	public static final TriFunction<List<Employee>, Integer, String, String> EMPLOYEES_WITH_SALARY_AND_NAME = (
			employeeList, salaryRange, targetLastNameRange) -> employeeList.stream()
					.filter(emp -> emp.getSalary() > salaryRange)
					.filter(emp -> (emp.getLastName().charAt(0) + "")
							.compareTo(targetLastNameRange) > 0)
					.map(emp -> emp.getFirstName() + " " + emp.getLastName()).sorted()
					.collect(Collectors.joining(", "));
}

