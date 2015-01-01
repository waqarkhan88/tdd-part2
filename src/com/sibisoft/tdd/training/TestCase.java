package com.sibisoft.tdd.training;

import java.lang.reflect.Method;

public class TestCase {
	
	protected String name;
	
	public TestCase(String testMethodName) {
		this.name = testMethodName;
	}
	
	public void setUp() {
		
	}
	
	public void run() throws Exception {
		setUp();
		Method method = this.getClass().getDeclaredMethod(this.name);
		if(method != null) {
			method.setAccessible(true);
			method.invoke(this);
		}
	}
}
