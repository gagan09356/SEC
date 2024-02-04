package com.gagan.springdatajpa.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.gagan.springdatajpa.modal.Employee;

@Service
public interface EmpService {

	ArrayList<Employee> findAllEmployee();
	Employee getEmployeeById(long id);
	void addEmployee();
	void deleteEmployee(long id);
}
