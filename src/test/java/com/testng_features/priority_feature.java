package com.testng_features;

import javax.net.ssl.SSLContext;

import org.testng.annotations.Test;

public class priority_feature {

	@Test
	private void hsc() {
		System.out.println("HSC");
		
	}
	
	@Test(priority = -1)
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


