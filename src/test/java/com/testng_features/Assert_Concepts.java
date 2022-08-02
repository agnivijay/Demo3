package com.testng_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concepts {
	
	
	@Test
	private void demo_A() {
		String db_username="starc";
		String actual="starc";
		
		Assert.assertEquals(actual, db_username);
		
		
	}
	

}
