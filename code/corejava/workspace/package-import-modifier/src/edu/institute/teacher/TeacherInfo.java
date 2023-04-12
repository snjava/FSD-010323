package edu.institute.teacher;

import edu.institute.student.StudentInfo;
import edu.institute.student.StudentPlacementDetails;

public class TeacherInfo extends StudentInfo {

	public void getStudInfoByObject() {
		StudentInfo info = new StudentInfo();
		System.out.println(info.id);
		//System.out.println(info.name);
		//System.out.println(info.email);
		//System.out.println(info.dob);
	}

	public void getStudInfoByInheritance() {
		System.out.println(id);
		System.out.println(name);
		//System.out.println(email);
		//System.out.println(dob);
	}
}

class TeacherSessions {
	StudentInfo sinfo = new StudentInfo();
}
