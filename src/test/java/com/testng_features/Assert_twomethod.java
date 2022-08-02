package com.testng_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_twomethod {
	
	@Test
	private void demo_A() {
		String db_Username="Starc";
		String actual="starc";
		Assert.assertEquals(actual,db_Username);
		System.out.println("Validation Successfully");
	}
	
	@Test
	private void demo_B() {
		String db_Pass="Starc@123";
		String actual="Starc@123";
		Assert.assertEquals(actual,db_Pass);
		System.out.println("Validation Successfully");
		
		
	}
	

}
