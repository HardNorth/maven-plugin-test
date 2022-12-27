package com.epam.reportportal;

import org.junit.jupiter.api.Test;

public class SimpleTest {

	@Test
	public void setupTest() {
		System.err.println("Test param: " + System.getProperty("test.param"));
	}

}
