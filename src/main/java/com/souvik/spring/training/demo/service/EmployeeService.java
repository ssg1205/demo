package com.souvik.spring.training.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.souvik.spring.training.demo.controller.dao.Employee;


public interface EmployeeService {
	
	public static final Employee employee = new Employee();
	
	List<Employee> findAll();
	
	void updateEmployee(Employee emp);
	
	void addEmployee(List<Employee> empList);
	
	void deleteEmployee(String empNo);
	
	
	//public List<Employee> update(Employee emp);

}
