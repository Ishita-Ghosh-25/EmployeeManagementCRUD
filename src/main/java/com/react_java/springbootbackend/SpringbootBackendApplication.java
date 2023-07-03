package com.react_java.springbootbackend;

import com.react_java.springbootbackend.model.Employee;
import com.react_java.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {


	public static void main(String[] args) {SpringApplication.run(SpringbootBackendApplication.class, args);}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Pragati");
//		employee.setLastName("Malviya");
//		employee.setEmailId("pragatimalviya121@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Shivam");
//		employee1.setLastName("Rawat");
//		employee1.setEmailId("shivamrawat031@gmail.com");
//		employeeRepository.save(employee1);
	}
}




