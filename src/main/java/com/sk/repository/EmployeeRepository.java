package com.sk.repository;

import org.springframework.data.repository.CrudRepository;

import com.sk.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
