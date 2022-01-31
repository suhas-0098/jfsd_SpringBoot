package com.klu.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices 
{
	@Autowired//linking one pojo class to another is called autowired
	EmployeeRepository emprepository;

	
	public void addemployeerecord(Employee emp) {
		
		emprepository.save(emp);
	}
	
	public List<Employee> getallemployeerecords() {
		
		return (List<Employee>)emprepository.findAll();
	}
	
	
	public void deleteemployeerecord(int id) {

		emprepository.deleteById(id);
		
	}
	
	
}
