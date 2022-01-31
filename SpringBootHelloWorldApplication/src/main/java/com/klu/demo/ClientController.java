package com.klu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	
	
	@GetMapping(value="/")
	public String display() {
		return "Welcome to spring boot rest controller";
	}
	
	@GetMapping(value="/suhas")
	public String display3() {
		return "Welcome to spring boot rest controller";
	}

	
	@GetMapping(value="/klu")
	public String display1() {
		return "Welcome to spring boot rest controller klu ";
	}
}
