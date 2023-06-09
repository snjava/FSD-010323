package edu.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.learning.dto.UserInfo;
import edu.learning.service.UserInfoService;

@SpringBootApplication
public class SbJpaIntroApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbJpaIntroApplication.class, args);
		UserInfoService service = ctx.getBean(UserInfoService.class);
		//service.saveUser();
		//service.updateUser();
		/*
		UserInfo info = service.getUser(121);
		System.out.println("Id : " + info.getUid());
		System.out.println("Name : " + info.getName());
		System.out.println("Email : " + info.getEmail());
		System.out.println("Contact : " + info.getContact());
		*/
		service.deleteUser(121);
	}

}

		