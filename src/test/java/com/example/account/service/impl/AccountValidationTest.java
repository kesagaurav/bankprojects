package com.example.account.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.model.Account;

class AccountValidationTest {

	private AccountValidation av;
	
	@BeforeEach
	void setUp() throws Exception {
		av=new AccountValidation();
	
		
	}
	
	
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAccountNumberIsNonNegative() {
		float number=12000;
		av.isNonNegativeNumber(number);
	}

	
	@Test
	void testAccountNumberBalanceIsGreaterThan() {
		float balance=12000;
		float number=1000;
		av.isBalanceGreater(balance, number);
	}
	
	@Test
	void testisValidTransactionAmount() {
		float amount=10000;
		av.isValidTransactionAmount(amount);
	}
	
	
	
	
}
