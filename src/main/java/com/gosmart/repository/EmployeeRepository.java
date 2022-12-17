package com.gosmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gosmart.repository.entity.EmployeeEntity;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
	public EmployeeEntity findByEmployeeEmailId(String employeeEmailId);
}
