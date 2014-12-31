package com.sibisoft.tdd.training.tests;

import com.sibisoft.tdd.training.TestCase;
import com.sibisoft.tdd.training.WasRun;

public class TestCaseTest extends TestCase {
	
	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}
	
	public void testRunning() {
//		System.out.println("testRunning()");
		WasRun test = new WasRun("testMethod");
//		System.out.println("test.wasRun()="+test.wasRun());
		assert test.wasRun(); // TODO: assert not working with methods invoked through reflection
		test.run();
		assert test.wasRun();
	}
}
