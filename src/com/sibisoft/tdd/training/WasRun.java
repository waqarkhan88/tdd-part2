package com.sibisoft.tdd.training;

public class WasRun extends TestCase {
	
	private boolean wasRun;
	private boolean wasSetUp;
	
	public WasRun(String testMethodName) {
		super(testMethodName);
		this.wasRun = false;
	}
	
	public boolean wasRun() {
		return this.wasRun;
	}
	
	public boolean wasSetUp() {
		return this.wasSetUp;
	}
	
	public void setUp() {
		this.wasRun = false;
		this.wasSetUp = true;
	}
	
	public void testMethod() {
		this.wasRun = true;
	}

}
