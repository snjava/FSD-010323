package edu.learning.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.learning.util.DbConnection;

@Component
public class StudentDbOpearations {

	@Autowired // use to inject of one class into another class (Automate the DI process)
	DbConnection dbConnection;  // HAS-A relation
	
	public void saveStudent() {
		System.out.println(dbConnection.getDriver());
		System.out.println(dbConnection.getUrl());
		System.out.println(dbConnection.getUsername());
		System.out.println(dbConnection.getPassword());
	}
	
}
