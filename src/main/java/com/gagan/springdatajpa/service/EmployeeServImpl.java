package com.gagan.springdatajpa.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gagan.springdatajpa.modal.Employee;
import com.gagan.springdatajpa.repository.EmployeeRepository;

@Service
public class EmployeeServImpl implements EmpService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public ArrayList<Employee> findAllEmployee(){
		return (ArrayList<Employee>) employeeRepository.findAll();
	}
	
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> emp =employeeRepository.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}
		else {
			return null;
		}
	}
	
	
	
	@Override
	public void	addEmployee(){
		//nothing to add as of now
		Employee emp = employeeRepository.getById((long)1);
		emp.setName("Anushka Panwar");
		emp.setSalary(30000);
		employeeRepository.save(emp);
	}
	
	@Override
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
	}
}
