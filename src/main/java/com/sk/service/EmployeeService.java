package com.sk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sk.model.Employee;
import com.sk.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;

	public Employee getEmpById(Long id) {
		return repository.findById(id).get();
	}

	public Employee saveEmp(Employee emp) {
		return repository.save(emp);
	}

	public Employee updateEmp(Employee emp) {
		return repository.save(emp);
	}

	public void deleteEmp(Long id) {
		repository.deleteById(id);
	}

}
