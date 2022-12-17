package com.gosmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gosmart.constants.EmployeeConstants;
import com.gosmart.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emp/isexists")
	public ResponseEntity<Boolean> isEmployeeExists(@PathVariable String emailId)
	{
		log.info("{}-Controller isEmployeeExist() started",EmployeeConstants.EMPLOYEE);
		
		

		try {
			log.info("{}-Controller isEmployeeExist() fetching details from repository",EmployeeConstants.EMPLOYEE);

			Boolean isExists=employeeService.isEmployeeExist(emailId);
			return new ResponseEntity<>(isExists,HttpStatus.OK);
		} catch (Exception e) {
			log.error("{}-Controller isEmployeeExist() Exception occurred -{}",EmployeeConstants.EMPLOYEE, e.getMessage());

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
