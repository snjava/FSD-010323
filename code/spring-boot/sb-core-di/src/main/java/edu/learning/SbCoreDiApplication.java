package edu.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import edu.learning.student.StudentDbOpearations;
import edu.learning.util.DbConnection;

@SpringBootApplication
public class SbCoreDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbCoreDiApplication.class, args);
		
		StudentDbOpearations stud = ctx.getBean(StudentDbOpearations.class);
		stud.saveStudent();
		
	}
	
	@Bean // Using this you can create Object of java class manually and share this object to spring for managing
	public DbConnection getDbConnection() {
		DbConnection dbCon = new DbConnection("DriverName", "URL", "userName", "Password"); // Constructor Injection (CI)
		
		/*dbCon.setDriver("DriverName"); // Setter Injection (SI)
		dbCon.setUrl("URL");
		dbCon.setUsername("UserName");
		dbCon.setPassword("Password");*/
		
		return dbCon;
	}

}





