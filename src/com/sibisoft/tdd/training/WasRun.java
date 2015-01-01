package com.sibisoft.tdd.training;

public class WasRun extends TestCase {
	
	private boolean wasRun;
	private String log;
	
	public WasRun(String testMethodName) {
		super(testMethodName);
		this.wasRun = false;
	}
	
	public boolean wasRun() {
		return this.wasRun;
	}
	
	public String log() {
		return this.log;
	}
	
	public void setUp() {
		this.log = "setUp ";
	}
	
	public void testMethod() {
		this.log += "testMethod ";
	}
	
	public void tearDown() {
		this.log += "tearDown ";
	}

}
