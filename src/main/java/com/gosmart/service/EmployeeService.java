package com.gosmart.service;

import com.gosmart.repository.entity.EmployeeEntity;

public interface EmployeeService {
	public Boolean isEmployeeExist(String emailId);
	public Integer insertEmployee(EmployeeEntity employeeEntity);
	

}
