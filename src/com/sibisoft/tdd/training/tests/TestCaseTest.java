package com.sibisoft.tdd.training.tests;

import com.sibisoft.tdd.training.TestCase;
import com.sibisoft.tdd.training.WasRun;

public class TestCaseTest extends TestCase {
	
	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}
	
	public void testRunning() throws Exception {
//		System.out.println("testRunning()");
		WasRun test = new WasRun("testMethod");
//		System.out.println("test.wasRun()="+test.wasRun());
		assert !test.wasRun();
		test.run();
		assert test.wasRun();
	}
	
	public void testSetUp() throws Exception {
		WasRun test = new WasRun("testMethod");
		test.run();
		assert test.wasSetUp();
	}
}
