package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@GetMapping("/EmployeeInfo")
	public Employee getEmployee() {
		Employee employee = new Employee("Akash", "Acharya", 57);

		return employee;
	}
	

}
