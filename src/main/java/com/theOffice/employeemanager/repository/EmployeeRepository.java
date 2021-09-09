package com.theOffice.employeemanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theOffice.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
		
	void deleteEmployeeById(Long id);
	public Optional<Employee> findEmployeeById(Long id);
}
