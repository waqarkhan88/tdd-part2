package com.sibisoft.tdd.training.tests;

import com.sibisoft.tdd.training.WasRun;

public class FrameworkTest {
	
	public static void main(String[] args) {
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun());
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(test.wasRun());
	}
	
}
