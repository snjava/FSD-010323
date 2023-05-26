package edu.learning.student;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(scopeName = "singleton")
@Component
public class StudentInfo {
	public StudentInfo() {
		System.out.println("StudentInfo Object Created");
	}
}
