package com.klu.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ConfigStudent 

{
   @Bean
  public int id()
  {
    return 101;
  }
   @Bean
  public String name()
  {
    return "klef";
  }
   @Bean
  public String gender()
  {
    return "male";
  }
   @Bean
  public double age()
  {
    return 20;
  }
   @Bean
  public String department()
  {
    return "cse";
  }
  
}