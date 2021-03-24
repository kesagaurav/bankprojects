package com.example.customer.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import com.example.customer.service.CustomerService;
import com.example.model.Customer;

public class CustomerServiceImplTest {

	private static CustomerService service;
	private static Customer cu1,cu2;
	private static List<Customer> customer;
	
	
	@BeforeAll
	public  void setUp() {
		service=new CustomerServiceImpl();
		cu1=new Customer(1,"gaurav","kesa","12-11-1998","123456");
		
	
	}
	
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValidateCredentials() {
		int id=1;
		String password="123456";
	try {
		assertEquals(true,service.addCredientails(id,password));
	}catch(Exception e) {
		e.getMessage();
	}
	}

	@Test
	public void testToGetAllCustomers() {
	try {
		assertEquals(true,service.getAllCustomers());
	}catch(Exception e) {
		
	}
	}
	
	@Test
	public void testToAddCustomer() {
	try {
		assertEquals(true,service.addCustomer(cu1));
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}

}
