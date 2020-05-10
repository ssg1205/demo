package com.souvik.spring.training.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.souvik.spring.training.demo.controller.dao.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	@Override
	List<Employee> findAll();
	
	/*
	 * @Override default <S extends Employee> List<S> saveAll(Iterable<S> entities)
	 * { // TODO Auto-generated method stub return null; }
	 * 
	 * @Override default <S extends Employee> List<S> insert(Iterable<S> entities) {
	 * // TODO Auto-generated method stub return null; }
	 */
	/*
	 * @Override default void delete(Employee entity) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 */
	/*
	 * @Override default void deleteById(String id) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 */
	
}
