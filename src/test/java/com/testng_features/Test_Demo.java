package com.testng_features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Demo {

	@Test
	public void mobile() {
		System.out.println("Vijay");
		}
	
	
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
	@AfterMethod
	public void logout() {

		System.out.println("logout");
	}
	
}
