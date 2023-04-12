package edu.institute.student;

public class StudentPlacementDetails extends StudentInfo {
	
	public void studInfo() {
		StudentInfo info = new StudentInfo();
		System.out.println(info.id);
		System.out.println(info.name);
		System.out.println(info.email);
		//System.out.println(info.dob);
	}
	
	public void studInfoByInheritance() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		//System.out.println(dob);
	}
}