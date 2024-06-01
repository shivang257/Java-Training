package com.coforge.tests;

import org.testng.annotations.Test;

public class TestBankApp {

	@Test(priority = 1)
public void testRegistration() {
		
	System.out.println("Registering");}

	@Test(priority = 2)
public void testLogin() {
	System.out.println("Login....");
}

	@Test(priority = 3)
	public void testCheckBalance() {
		System.out.println("Balance available");
	}
	
	@Test(priority = 4)
	public void testTransferFunds() {
		System.out.println("Transferring Funds.....");
	}
	
	@Test(priority = 5)
	public void testLogout() {
		System.out.println("Logout....");
	}

	}
