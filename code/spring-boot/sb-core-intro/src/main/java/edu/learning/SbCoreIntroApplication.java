package edu.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import edu.learning.student.StudentInfo;
import edu.learning.teacher.TeacherInfo;

@ComponentScan(basePackages = {"com.demo", "edu.learning"})
@SpringBootApplication
public class SbCoreIntroApplication {

	public static void main(String[] args) {
	 	ApplicationContext ctx = SpringApplication.run(SbCoreIntroApplication.class, args);
	 	
	 	StudentInfo stud1 = ctx.getBean(StudentInfo.class); //to get the object of bean class from container
	 	StudentInfo stud2 = ctx.getBean(StudentInfo.class);
	 	StudentInfo stud3 = ctx.getBean(StudentInfo.class);
	 	StudentInfo stud4 = ctx.getBean(StudentInfo.class);
	 	StudentInfo stud5 = ctx.getBean(StudentInfo.class);
	 	TeacherInfo teach = ctx.getBean(TeacherInfo.class); //to get the object of bean class from container
	 	System.out.println("END OF THE MAIN");
	}

}
