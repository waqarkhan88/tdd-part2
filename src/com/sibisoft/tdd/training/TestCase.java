package com.sibisoft.tdd.training;

import java.lang.reflect.Method;

public class TestCase {
	
	protected String name;
	protected TestResult result;
	
	public TestCase(String testMethodName) {
		this.name = testMethodName;
	}
	
	public void setUp() {
		
	}
	
	public void tearDown() {
		
	}
	
	public void run(TestResult result) throws Exception {
		result.testStarted();
		setUp();
		try {
			Method method = this.getClass().getMethod(this.name);
			method.invoke(this);
		} catch(Exception e) {
			result.testFailed();
		}
		tearDown();
	}
}
