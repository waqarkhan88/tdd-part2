package com.sibisoft.tdd.training.tests;

public class FrameworkTest {
	
	public static void main(String[] args) {
		try {
			new TestCaseTest("testTemplateMethod").run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
