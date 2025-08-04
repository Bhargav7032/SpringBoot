package com.ciq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ciq.entity.Department;
import com.ciq.entity.Employee;
import com.ciq.repositroy.DepartmentRepositroy;
import com.ciq.repositroy.EmployeeRepositroy;

@SpringBootApplication
public class SpringBootOneToManyWithCommandLineRunnerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToManyWithCommandLineRunnerApplication.class, args);
	}

	@Autowired
	private DepartmentRepositroy departmentRepositroy;
	
	@Autowired
	private EmployeeRepositroy employeerepositroy;
	
	
	
	@Override
	public void run(String... args) throws Exception {

		Department department= new Department();
		department.setDname("IT");
		department.setPname("Java__Project");
		department=departmentRepositroy.save(department);
		
		Employee employee = new Employee();
		employee.setName("Bhargav");
		employee.setSalary(23000.00);
		employee.setDepartment(department);
		employeerepositroy.save(employee);
		
		
		
		Employee employee1 = new Employee();
		employee1.setName("Bhargavraj");
		employee1.setSalary(25000.00);
		employee1.setDepartment(department);
		employeerepositroy.save(employee1);
		
		
		Employee employee2 = new Employee();
		employee2.setName("Revi");
		employee2.setSalary(30000.00);
		employee2.setDepartment(department);
		employeerepositroy.save(employee2);
		
		
		
	}
	
	

}
