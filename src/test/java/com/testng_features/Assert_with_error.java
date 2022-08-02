package com.testng_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_with_error {
	
	
	@Test
	private void demo_A() {
		String db_username="starc";
		String actual="Starc";
		
		Assert.assertEquals(actual,db_username);
		System.out.println("Valdiation Successfully");
		
		
	}
	

}
