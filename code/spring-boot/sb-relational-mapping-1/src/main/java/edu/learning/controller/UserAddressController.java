package edu.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.entity.UserAddress;
import edu.learning.repository.UserAddressRepository;

@RestController
public class UserAddressController {
	
	@Autowired
	UserAddressRepository addressRepository;
	
	@PostMapping("/save-user-address")
	public String saveAddress(@RequestBody UserAddress address) {
		addressRepository.save(address);
		return "User Address added successfully...";
	}
	
	@GetMapping("/get-all-addresses")
	public List<UserAddress> getAddress() {
		return addressRepository.findAll();
	}
}
