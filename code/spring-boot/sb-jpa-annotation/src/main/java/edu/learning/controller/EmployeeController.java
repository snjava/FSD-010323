package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.employee.Employee;
import edu.learning.repository.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;
	
	@PostMapping("/save-emp")
	public String saveEmp(@RequestBody Employee emp) {
		repo.save(emp);
		return "Employee Created Successfully...";
	}
	
	@GetMapping("/get-all-emp")
	public List<Employee> getAllEmp() {
		return repo.findAll();
	}
	
	@DeleteMapping("/delete-emp")
	public String deleteEmp(@RequestParam("empid") int id) {
		repo.deleteById(id);
		return "Employee Deleted Successfully having Id : " + id;
	}
	
}











