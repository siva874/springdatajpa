package com.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sk.model.Employee;
import com.sk.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@GetMapping("/getEmpById/{id}")
	public Employee getEmpById(@PathVariable Long id) {
		return service.getEmpById(id);
	}

	@PostMapping("/saveEmp")
	public Employee saveEmp(@RequestBody Employee emp) {
		return service.saveEmp(emp);
	}

	@PutMapping("/updateEmp")
	public Employee updateEmp(@RequestBody Employee emp) {
		return service.updateEmp(emp);
	}

	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable Long id) {
		service.deleteEmp(id);
		return "Success";
	}
}
