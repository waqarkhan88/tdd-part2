package com.sibisoft.tdd.training.tests;

import com.sibisoft.tdd.training.TestResult;
import com.sibisoft.tdd.training.TestSuite;

public class FrameworkTest {
	
	public static void main(String[] args) {
		try {
			TestSuite suite = new TestSuite();
			TestResult result = new TestResult();
			
			suite.add(new TestCaseTest("testTemplateMethod"));
			suite.add(new TestCaseTest("testResult"));
			suite.add(new TestCaseTest("testFailedResultFormatting"));
			suite.add(new TestCaseTest("testFailedResult"));
			suite.add(new TestCaseTest("testSuite"));
			
			suite.run(result);
			System.out.println(result.summary());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
