package com.example.account.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import com.example.account.service.AccountSearchService;
import com.example.exception.BusinessException;
import com.example.model.Account;
import com.example.model.Customer;


public class AccountSearchImplTest {

		private static AccountSearchService service;
		Account a=new Account();
		Customer c=new Customer();
		
		
		@BeforeAll
		public  void setUpService() {
			service=new AccountSearchImpl();
		}
	

	@Test
	public void test() throws BusinessException {
		String accountnumber="123456";
		assertEquals(false,service.getAccountByAccountNumber(accountnumber));
		
	}

}
