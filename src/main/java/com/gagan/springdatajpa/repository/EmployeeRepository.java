package com.gagan.springdatajpa.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gagan.springdatajpa.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	//ArrayList<Employee> findAllEmployee();
	//int deleteEmployee(int id);
}
