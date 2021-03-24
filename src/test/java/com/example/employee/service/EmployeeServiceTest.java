package com.example.employee.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.employee.service.impl.EmployeeServiceImpl;
import com.example.exception.BusinessException;

class EmployeeServiceTest {

	private static EmployeeService es;
	
	@BeforeAll
	public static  void setUpEmployee() {
		es=new EmployeeServiceImpl();
	}
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEmployeeCredentials() throws BusinessException {
		int empid=1;
		String password="123456";
		es.addEmployeeCredentials(empid, password);
	}

}
