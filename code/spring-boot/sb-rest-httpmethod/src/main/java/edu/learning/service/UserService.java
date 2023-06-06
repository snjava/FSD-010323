package edu.learning.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import edu.learning.dto.UserDto;

@Service
public class UserService {
	ArrayList<UserDto> users = new ArrayList<UserDto>();
	
	public void addUser(UserDto dto) {
		users.add(dto);
	}
	
	public ArrayList<UserDto> getAllUsers() {
		return users;
	}
	
	public void updateUser(UserDto updateDto) {
		for(UserDto u : users) {
			if(u.getId() == updateDto.getId()) {
				u.setName(updateDto.getName());
				u.setEmail(updateDto.getEmail());
			}
		}
	}
	
	public void deleteUser(int id) {
		UserDto deleteUser = null;
		for(UserDto u : users) {
			if(u.getId() == id ) {
				deleteUser = u;
			}
		}
		if(deleteUser != null) {
			users.remove(deleteUser);
		}
	}
}
