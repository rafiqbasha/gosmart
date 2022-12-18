package com.gosmart.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gosmart.exception.GoSmartException;
import com.gosmart.repository.entity.EmployeeEntity;
import com.gosmart.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeControllerTest {
	@InjectMocks
	private EmployeeController controller;
	@Mock
	private EmployeeService service;
	
	@Test
	public void testIsEmployeeExists() throws Exception {
		String emailId = "rafiq@gmail.com";

		when(service.isEmployeeExist(emailId)).thenThrow(NullPointerException.class);
		ResponseEntity<Boolean> response = controller.isEmployeeExists(emailId);
		assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());

	}
	@Test
	public void testIsEmployeeExists_Exception() throws Exception {
		String emailId = "rafiq@gmail.com";

		when(service.isEmployeeExist(emailId)).thenThrow(NullPointerException.class);
		ResponseEntity<Boolean> response = controller.isEmployeeExists(emailId);
		assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());

	}
	

	@Test
	public void testInsertEmployee() throws Exception {
		String emailId = "rafiq@gmail.com";
		EmployeeEntity employeeEntity=new EmployeeEntity();
		Integer emailId2=1;
		when(service.insertEmployee(employeeEntity)).thenReturn(emailId2);
		ResponseEntity<Integer> response = controller.insertEmployee(employeeEntity);
		assertEquals(HttpStatus.CREATED, response.getStatusCode());

	}

	@Test(expected = GoSmartException.class)
	public void testInsertEmployee_Exception() throws Exception {
		EmployeeEntity employeeEntity=new EmployeeEntity();
		when(service.insertEmployee(employeeEntity)).thenThrow(NullPointerException.class);
		ResponseEntity<Integer> response = controller.insertEmployee(employeeEntity);
		assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());

	}
}
