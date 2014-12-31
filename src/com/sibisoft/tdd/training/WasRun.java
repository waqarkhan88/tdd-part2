package com.sibisoft.tdd.training;

public class WasRun extends TestCase {
	
	private boolean wasRun;
	
	public WasRun(String testMethodName) {
		super(testMethodName);
		this.wasRun = false;
	}
	
	public boolean wasRun() {
		return this.wasRun;
	}
	
	public void testMethod() {
		this.wasRun = true;
	}

}
