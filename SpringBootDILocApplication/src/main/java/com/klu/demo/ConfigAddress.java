package com.klu.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAddress {

	 @Bean
	  public String location()
	  {
	    return "chittor";
	  }
	  
	  @Bean
	  
	  public int pincode()
	  {
	    return 517421; 
	  }
	
}
