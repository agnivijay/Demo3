package com.testng_features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun_purpose implements IRetryAnalyzer{
	
	public boolean retry(ITestResult result) {

		int end,start;
		end=2;
		start=1;
		if (start<=end) {
			start++;
			return true;
		}
		return false;
	}

}
