package edu.learning.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.dto.User;

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
	
	
	/*
	 	http://localhost:8080/user-info
	 	{
	 		"name": "Abc",
	 		"email": "abc@gmail.com",
	 		"contact": "7788990099"
	 	}
	 */
	
	@GetMapping("/user-info")
	public String getUserInfo(@RequestBody User user) {
		System.out.println("Name : " + user.getName());
		System.out.println("Email : " + user.getEmail());
		System.out.println("Contact : " + user.getContact());
		return "Hello User, " + user.getName();
	}
	
	// http://localhost:8080/get-user-info
	@GetMapping("/get-user-info")
	public User getUserInfo() {
		User user = new User();
		user.setName("Xyz");
		user.setEmail("xyz@gmail.com");
		user.setContact("9988000099");
		return user;
	}
	
	// http://localhost:8080/get-user-list
	@GetMapping("/get-user-list")
	public List<User> getUsersInfo() {
		ArrayList<User> list = new ArrayList<User>();
		User u1 = new User();
		u1.setName("Xyz");
		u1.setEmail("xyz@gmail.com");
		u1.setContact("9988000099");
		
		User u2 = new User();
		u2.setName("Pqr");
		u2.setEmail("pqr@gmail.com");
		u2.setContact("9090901111");
		
		list.add(u1);
		list.add(u2);
		
		return list;
	}
		
	
}














