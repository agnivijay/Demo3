package com.testng_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class invocation_ignore {
	
	@Test
	private void hsc() {
		System.out.println("HSC");
		
	}
	
	@Test(priority = -1,invocationCount = 3,invocationTimeOut = 5)
	private void SSLC() {

		System.out.println("SSLC");		
	}
	@Test(priority = 2)
	private void ug() {

		System.out.println("UG");
	}
	
	
	@Test(priority = -3)
	private void pg() {

		System.out.println("PG");		
	}

}
