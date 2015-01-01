package com.sibisoft.tdd.training.tests;

import com.sibisoft.tdd.training.TestCase;
import com.sibisoft.tdd.training.TestResult;
import com.sibisoft.tdd.training.TestSuite;
import com.sibisoft.tdd.training.WasRun;

public class TestCaseTest extends TestCase {
	
	private WasRun test;
	private TestSuite suite;
	
	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}
	
	@Override
	public void setUp() {
		result = new TestResult();
	}
	
	public void testTemplateMethod() throws Exception {
		test = new WasRun("testMethod");
		test.run(result);
		assert test.log().equals("setUp testMethod tearDown ");
	}
	
	public void testResult() throws Exception {
		test = new WasRun("testMethod");
		test.run(result);
		assert result.summary().equals("1 run, 0 failed");
	}
	
	public void testFailedResult() throws Exception {
		test = new WasRun("testBrokenMethod");
		test.run(result);
		assert result.summary().equals("1 run, 1 failed");
	}
	
	public void testFailedResultFormatting() throws Exception {
		result.testStarted();
		result.testFailed();
		assert result.summary().equals("1 run, 1 failed");
	}
	
	public void testSuite() throws Exception {
		suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		suite.run(result);
		assert result.summary().equals("2 run, 1 failed");
	}
}
