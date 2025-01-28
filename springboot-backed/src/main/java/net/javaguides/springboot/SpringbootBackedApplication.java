package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackedApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackedApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("John");
//		employee.setLastName("Doe");
//		employee.setEmailId("deo@email.com");
//		employeeRepository.save(employee);
//
//
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Mashami");
//		employee1.setLastName("paccy");
//		employee1.setEmailId("paccy@email.com");
//		employeeRepository.save(employee1);

	}
}