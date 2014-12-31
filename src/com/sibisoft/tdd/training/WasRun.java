package com.sibisoft.tdd.training;

import java.lang.reflect.Method;

public class WasRun {
	
	private boolean wasRun;
	private String name;
	
	public WasRun(String testMethodName) {
		this.wasRun = false;
		this.name = testMethodName;
	}
	
	public boolean wasRun() {
		return this.wasRun;
	}
	
	public void testMethod() {
		this.wasRun = true;
	}
	
	public void run() throws Exception {
		try {
			Method method = this.getClass().getMethod(this.name);
			if(method != null) {
				method.invoke(this);
			} else {
				this.wasRun = false;
			}
		} catch (NoSuchMethodException e) {
			this.wasRun = false;
		}
	}

}
