package com.klu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientContoller
{

	@RequestMapping(value="/demo")
	public String display()
	{
		
		return "index";
	}
	
	
}
