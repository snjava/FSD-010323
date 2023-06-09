package edu.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.learning.dto.UserInfo;
import edu.learning.repository.UserInfoRepo;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoRepo infoRepo;
	
	public void saveUser() {
		UserInfo info = new UserInfo();
		info.setUid(121);
		info.setName("Abc");
		info.setEmail("abc@gmail.com");
		info.setContact("9988009988");
		infoRepo.save(info); // method to insert or update data into table 
	}
	
	public void updateUser() {
		UserInfo info = new UserInfo();
		info.setUid(121);
		info.setName("Abc");
		info.setEmail("abc@yahoo.com");
		info.setContact("9999998888");
		infoRepo.save(info); // method to insert or update data into table
	}
	
	public UserInfo getUser(int id) {
		//return infoRepo.getById(id);
		return infoRepo.findById(id).get();
	}
	
	public void deleteUser(int id) {
		infoRepo.deleteById(id);
	}
	
}









