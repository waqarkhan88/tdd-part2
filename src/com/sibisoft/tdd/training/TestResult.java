package com.sibisoft.tdd.training;

public class TestResult {
	
	private int runCount;
	private int errCount;
	
	public TestResult() {
		this.runCount = 0;
		this.errCount = 0;
	}
	
	public void testStarted() {
		this.runCount += 1;
	}
	
	public void testFailed() {
		this.errCount += 1;
	}
	
	public String summary() {
		return String.format("%d run, %d failed", this.runCount, this.errCount);
	}

}
