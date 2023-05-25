package edu.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbIntroApplication {

	public static void main(String[] args) {
		// to start the spring boot application.
		SpringApplication.run(SbIntroApplication.class, args); // return Spring Container which is ApplicationContext
	}

}
