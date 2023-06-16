package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.UserInfo;
import edu.learning.repository.UserInfoRepository;

@RestController
public class UserInfoController {

	@Autowired
	private UserInfoRepository repository;
	
	@PostMapping("/save-user-info")
	public String saveUser(@RequestBody UserInfo info) {
		repository.save(info);
		return "User Info Save Successfully";
	}

	@GetMapping("/get-all-users")
	public List<UserInfo> getAlluser() {
		return repository.findAll();
	}
	
}




