package com.sibisoft.tdd.training;

import java.util.ArrayList;

public class TestSuite {
	
	ArrayList<TestCase> tests;
	
	public TestSuite() {
		tests = new ArrayList<TestCase>();
	}
	
	public void add(TestCase test) {
		tests.add(test);
	}
	
	public void run(TestResult result) throws Exception {
		for(TestCase test : tests) {
			test.run(result);
		}
	}
}
