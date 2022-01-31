package com.klu.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController 
{
	
	@Autowired
	EmployeeServices empservice;
	
	
	@GetMapping("/home")
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		
		return mv;
	}
	
	@GetMapping("/addemployee")
	public ModelAndView addemployee() {
		
		return new ModelAndView("addemployee","emp",new Employee());
	}
	
	@PostMapping("/submitempdata")
	public ModelAndView submitempdata(@ModelAttribute("emp") Employee emp) {
		
		
		empservice.addemployeerecord(emp);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addsuccess");
		mv.addObject("name",emp.getName());
		
		return mv;
		
	}
	
	@GetMapping("/viewemployee")
	public ModelAndView viewemployee() {
		
		List<Employee> employees = empservice.getallemployeerecords();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewemployee");
		mv.addObject("empdata",employees);
		
		return mv;
		
	}
	
//	@GetMapping("/deletemployee/{empid}")
//	public ModelAndView deleteemployee(@PathVariable("empid") int empid) {
//		
//		empservice.deleteemployeerecord(empid);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("deletesuccess");
//		
//		return mv;
//	}
	
	@GetMapping("/deletemployee/{empid}")
	public String deleteemployee(@PathVariable("empid") int empid) {
		
		empservice.deleteemployeerecord(empid);
		
		return "redirect:/viewemployee";
	}
	

}
