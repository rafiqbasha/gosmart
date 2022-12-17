package com.gosmart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gosmart.constants.EmployeeConstants;
import com.gosmart.exception.GoSmartException;
import com.gosmart.repository.EmployeeRepository;
import com.gosmart.repository.entity.EmployeeEntity;
import com.gosmart.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class EmpolyeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	/** 
	 * This method is used for the employee exist or not by using emailId
	 * @param emailId This is the parameter to isEmployeeExist()
	 * @return Boolean This returns employeeExist true or false
	 * */
	
	public Boolean isEmployeeExist(String emailId) {
		log.info("{}-ServiceImpl isEmployeeExist() started",EmployeeConstants.EMPLOYEE);
		Boolean isExist =false;
		
		try {
			log.info("{}-ServiceImpl isEmployeeExist() fetching details from repository",EmployeeConstants.EMPLOYEE);
			  EmployeeEntity employeeEntity=employeeRepository.findByEmployeeEmailId(emailId);
			 
			if(employeeEntity!=null)
			{
				isExist=true;
			}
		} catch (Exception e) {
			log.error("{}-ServiceImpl isEmployeeExist() Exception occurred -{}",EmployeeConstants.EMPLOYEE, e.getMessage());
			throw new GoSmartException(e.getMessage());
		}
		log.info("{}-ServiceImpl isEmployeeExist() is-{}",EmployeeConstants.EMPLOYEE,isExist);
		
		return isExist;
	}

}
