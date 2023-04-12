package edu.institute.student;

public class StudentInfo {
	public int id;
	protected String name;
	String email;
	private String dob;
	
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(dob);
	}
}
