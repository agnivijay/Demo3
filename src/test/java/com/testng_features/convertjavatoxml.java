package com.testng_features;

import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class convertjavatoxml {
	
	@BeforeSuite
	private void set_Property() {
		System.out.println("System Propety");
	}
	
	@BeforeTest
	private void browser_Launch() {
		System.out.println("browser Launch");
	}
	
	@BeforeClass
	private void url() {

		System.out.println("Goto URL");
		
	}

	@Test
	private void Laptop() {
	
		System.out.println("laptop");
	}
	
	@BeforeMethod
	private void login() {
	
		System.out.println("login");
	}
	
	@Test
	private void mobile() {
		System.out.println("mobile");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	private void verify_home_page() {
		System.out.println("Homepage");
	}
	
	@Test
	private void headphones() {
		System.out.println("heaphones");
	}
	
	@AfterTest
	private void close() {

		System.out.println("Close");
	}
	
	@AfterSuite
	private void Deletecookies() {

		System.out.println("DeleteAllcookies");
	}
}
