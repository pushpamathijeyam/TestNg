package org.sample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class TestCaseFailed implements IAnnotationTransformer {

	public void transform(ITestAnnotation test, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer re = test.getRetryAnalyzer();
		if (re == null) {
			test.setRetryAnalyzer(RerunFailed.class);
		}
	}

}
