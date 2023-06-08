package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.dto.UserDto;
import edu.learning.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {
	
	@Autowired
	UserService service;
	/*
	 http://localhost:8080/save-user
	 {
	 	"id":111,
	 	"name":"Abc",
	 	"email":"abc@gmail.com"
	 }
	 */
	@PostMapping("/save-user")
	public String saveUserData(@RequestBody UserDto dto) {
		service.addUser(dto);
		return "User Save Successfully.";
	}
	
	@GetMapping("/get-users")
	public List<UserDto> getuserData() {
		return service.getAllUsers();
	}
	
	//http://localhost:8080/update-user
	@PutMapping("/update-user")
	public String updateData(@RequestBody UserDto dto) {
		service.updateUser(dto);
		return "User Updated Successfully";
	}
	
	//http://localhost:8080/delete-user/111
	@DeleteMapping("/delete-user/{id}")
	public String deleteUser(@PathVariable(name = "id") int id) {
		service.deleteUser(id);
		return "User Deleted Successfully..";
	}
}













