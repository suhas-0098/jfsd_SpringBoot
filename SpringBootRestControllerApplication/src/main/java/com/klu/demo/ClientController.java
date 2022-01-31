package com.klu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	
	
	
	@GetMapping(value="/")
	public String display() {
		return "Welcome to spring boot rest controller";
	}
	
	@GetMapping(value="/suhas")
	public String display3() {
		return "Welcome to spring boot rest controller suhas";
	}

	
	@GetMapping(value="/klu")
	public String display1() {
		return "Welcome to spring boot rest controller klu ";
	}
	
	@GetMapping(value="/student")
	public Student display4(){
		Student s = new Student();
	  s.setId("101");
	s.setName("klu");
	s.setDepartment("cse");
	s.setAge(27.11);
	return s;

	}
	
	@GetMapping(value="/studentid")
	public String display5(){
		Student s = new Student();
	  s.setId("101");
	s.setName("klu");
	s.setDepartment("cse");
	s.setAge(27.11);
	return s.getId();

	}

	
	@GetMapping(value="test")
	public String display6() {
		return "Sample test";
		
	}

	
	@GetMapping(value="demo/{name}")
	public String display7(@PathVariable String name) {
		
		String msg ="Welcome "+name;
		return msg;
		
	}
	
	
	@GetMapping(value="demo2")
	public String display8(@RequestParam String name) {
		
		String msg ="Welcome "+name;
		return msg;
		
	}
}
