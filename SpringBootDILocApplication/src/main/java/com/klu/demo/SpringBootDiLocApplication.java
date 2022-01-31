package com.klu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDiLocApplication {

	public static void main(String[] args) {
		
		System.out.println("Spring Boot DI and Ioc Application");
		ConfigurableApplicationContext context=SpringApplication.run(SpringBootDiLocApplication.class, args);
		Student s=context.getBean(Student.class);
		System.out.println(s.toString());
	}

}
