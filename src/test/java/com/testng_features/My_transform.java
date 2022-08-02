package com.testng_features;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class My_transform implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		//@Test(retryAnalyser=Rerun_purpose.class)
		annotation.setRetryAnalyzer(Rerun_purpose.class);
	
	}

}
