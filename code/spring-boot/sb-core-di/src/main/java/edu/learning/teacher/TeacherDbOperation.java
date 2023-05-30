package edu.learning.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.learning.util.DbConnection;

@Component
public class TeacherDbOperation {
	@Autowired
	DbConnection connection;
	public void saveTeacher() {
		System.out.println("Save Teacher Details");
	}
}
