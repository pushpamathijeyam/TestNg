package org.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.sample.RerunFailed;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedTc implements IAnnotationTransformer{

	public void transform(ITestAnnotation test, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer test1 = test.getRetryAnalyzer();
		if(test1 != null)
		{
			test.setRetryAnalyzer(RerunFailed.class);
		}
		
	}
	

}
