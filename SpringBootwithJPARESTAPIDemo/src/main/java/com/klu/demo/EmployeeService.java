package com.klu.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService 
{
	
	@Autowired
	EmployeeRepository emprespository;
	
	//find all employee records
	public List<Employee> getallemployeerecords(){
		return (List<Employee>)emprespository.findAll();
	}
	
	
	//find employee records by id
	public Employee getemployeerecordbyid(int empid) {
		return emprespository.findById(empid).get();
		
	}
	
	//insert new employee records
	public String insertemprecord(Employee emp) {
			emprespository.save(emp);	
		return "employee record added successfully";
	}
	
	//update existing employee record
	public String updateemprecord(Employee emp) {
		emprespository.save(emp);
		return "employee record update successfully";
	
	}
	
	//deletion employee by id
	public String deleteempbyid(int empid) {
		emprespository.deleteById(empid);
		return "employee record deleted successfully";

	}
	
	
	

}
