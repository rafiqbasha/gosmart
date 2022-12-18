package com.gosmart.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gosmart.exception.GoSmartException;
import com.gosmart.repository.EmployeeRepository;
import com.gosmart.repository.entity.EmployeeEntity;

@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceImplTest {
	@InjectMocks
	private EmpolyeeServiceImpl service;
	@Mock
	private EmployeeRepository employeeRepository;
	
	@Test
	public void testIsEmployeeExist() throws Exception {
		String emailId="rafiq@gmail.com";
		EmployeeEntity employeeEntity2 =Mockito.any();
		when(employeeRepository.findByEmployeeEmailId(emailId)).thenReturn(employeeEntity2);
		Boolean isExist=service.isEmployeeExist(emailId);
		assertNotNull(isExist);
	}
	@Test
	public void testInsertEmployee() throws Exception {
		String emailId="rafiq@gmail.com";
		EmployeeEntity employeeEntity=new EmployeeEntity();
		EmployeeEntity employeeEntity2 =Mockito.any();
		when(employeeRepository.save(employeeEntity2)).thenReturn(employeeEntity2);
		Integer emailId2=service.insertEmployee(employeeEntity);
		assertNotNull(emailId);
	}
	@Test(expected = GoSmartException.class)
	public void testIsEmployeeExist_Exception() throws Exception {
		String emailId="rafiq@gmail.com";
		when(employeeRepository.findByEmployeeEmailId(emailId)).thenThrow(NullPointerException.class);
		service.isEmployeeExist(emailId);
		
	}
	
	@Test(expected = GoSmartException.class)
	public void testinsertEmployeet_Exception() throws Exception {
		String emailId="rafiq@gmail.com";
		EmployeeEntity employeeEntity=new EmployeeEntity();
		when(employeeRepository.save(employeeEntity)).thenThrow(NullPointerException.class);
		service.insertEmployee(employeeEntity);
		
	}


}
