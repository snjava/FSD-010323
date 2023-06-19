package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.Employee;
import edu.learning.repo.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;
	
	@PostMapping("/save-emp")
	public String saveEmployee(@RequestBody Employee emp) {
		repo.save(emp);
		return "Employee Save Successfully...";
	}
	
	@GetMapping("/get-emp")
	public List<Employee> getAllEmp() {
		return repo.findAll();
	}
	
}
