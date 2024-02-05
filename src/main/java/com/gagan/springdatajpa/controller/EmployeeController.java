package com.gagan.springdatajpa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gagan.springdatajpa.modal.Employee;
import com.gagan.springdatajpa.service.EmpService;
import com.gagan.springdatajpa.service.EmployeeServImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServImpl empd;
	
	@GetMapping("/findAll")
	public ArrayList<Employee> getAllEmployee() {
		return empd.findAllEmployee();
	
	}
	
	@GetMapping("/findone")
	public Employee getOneEmployee() {
		return empd.getEmployeeById(1); 
	}
	
	@PostMapping("/update")
	public void updateEmp() {
		empd.addEmployee();
	}
	
	@PostMapping("/delete")
	public void deleteEmp() {
		empd.deleteEmployee(2);
	}
}
