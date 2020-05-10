package com.souvik.spring.training.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.souvik.spring.training.demo.controller.dao.Employee;
import com.souvik.spring.training.demo.controller.dao.EmployeeDAO;
import com.souvik.spring.training.demo.repository.EmployeeRepository;
import com.souvik.spring.training.demo.service.EmployeeService;

@RestController
public class MainRestController {
	
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository; 
	
	
	@RequestMapping("/test")
	public String welcome() {
		return "Welcome to first Spring Boot app";
	}
	
	@RequestMapping(value = "listEmployees",
					method = RequestMethod.GET)
	public List<Employee> listEmployees(){
		
		return employeeService.findAll();
	}
	
	
	
	  @RequestMapping(value = "updateEmployees", 
			  		  method = RequestMethod.PUT,
			  		  produces = {MediaType.APPLICATION_JSON_VALUE}) 
	  public void updateEmployees(@RequestBody Employee emp){ 
	  employeeService.updateEmployee(emp); }
	 
	  @RequestMapping(value = "addEmployee", 
	  		  method = RequestMethod.POST,
	  		  produces = {MediaType.APPLICATION_JSON_VALUE}) 
	  public void addEmployee(@RequestBody List<Employee> empList){ 
	  employeeService.addEmployee(empList); }
	  
	  @RequestMapping(value = "deleteEmployee",
			  			method = RequestMethod.POST,
			  			produces  = {MediaType.APPLICATION_JSON_VALUE})
	  public void deleteEmployee(@RequestBody Employee emp) {
		  employeeService.deleteEmployee(emp);
	  }
	  
	/*
	 * @RequestMapping(value = "/employees", method = RequestMethod.GET, produces =
	 * { MediaType.APPLICATION_JSON_VALUE}) public List<Employee> getEmployees() {
	 * List<Employee> list = employeeDAO.getAllEmployees(); return list; }
	 * 
	 * 
	 * @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = {
	 * MediaType.APPLICATION_JSON_VALUE}) public Employee
	 * updateEmployee(@RequestBody Employee emp) { return
	 * employeeDAO.updateEmployee(emp); }
	 */
}
