package com.klu.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperations {
	
	private List<Employee> employeerecords;
	
	private static EmployeeOperations empid=null;
	
	private EmployeeOperations() {
		
		
		employeerecords = new ArrayList<Employee>();
	}

	
	public static EmployeeOperations getInstance()
	{
	if(empid == null)
	{
	empid = new EmployeeOperations();
	return empid;
	}
	else
	{
	return empid;
	}
	}
	
	public void add(Employee emp) {
		
		employeerecords.add(emp);
	}
	
	
	public String UpdateEmployee(Employee emp) {
		
		for(int i =0;i<employeerecords.size();i++) {
			
			Employee emp1 = employeerecords.get(i);
			
			if(emp.getId()==emp1.getId()) {
				employeerecords.set(i, emp);
				return "Update-Success";
			}
			
		}
		return "Update-Fail";
		
	}
	
	
	public String DeleteEmployee(int empid) {
		
		for(int i=0;i<employeerecords.size();i++) {
			
			Employee emp = employeerecords.get(i);
			
			if(emp.getId()==empid) {
				
				employeerecords.remove(i);
				
				return "Delete-Success";
			}
			
		}
		return "Delete-fail";
	}
	
	
	public List<Employee> getEmployeeRecords() // view all employees
	{
	return employeerecords;
	}

}
