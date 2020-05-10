package com.souvik.spring.training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.souvik.spring.training.demo.controller.dao.*;
import com.souvik.spring.training.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	private Employee emp;
	
	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
		/*
		 * List<Employee> update(Employee employee){ return
		 * employeeRepository.save(employee); }
		 */	
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		try {
				employeeRepository.save(emp);
				System.out.println( "successfully added");
			
		} finally {
			
		}
	}
	
	public void addEmployee(List<Employee> emp) {
		employeeRepository.insert(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeRepository.delete(emp);
		
	}
}
