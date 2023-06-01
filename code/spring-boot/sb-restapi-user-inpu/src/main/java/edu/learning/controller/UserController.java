package edu.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	// http://localhost:8080/user-data?fn=Abc&mn=Pqr&ln=Xyz
	@GetMapping("/user-data")
	public String userData(@RequestParam("fn") String fname, 
			@RequestParam("mn") String mname, 
			@RequestParam("ln") String lname) {
		return fname + " " + mname + " " + lname;
	}
	
	// http://localhost:8080/number-add?num1=12&num2=20
	@GetMapping("/number-add")
	public int addNumber(@RequestParam int num1, @RequestParam int num2) {
		return num1 + num2;
	}
	
	// http://localhost:8080/number-mul/20/5
	@GetMapping("/number-mul/{n1}/{n2}")
	public String mulNumber(@PathVariable("n1") int num1,
			@PathVariable("n2") int num2) {
		return "Multiplication : " + (num1 * num2);
	}
	
}






