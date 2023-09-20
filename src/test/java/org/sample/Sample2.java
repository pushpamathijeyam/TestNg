package org.sample;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(priority = -12,groups="smoke")
	private void tc5() {
		System.out.println("test case 5");
	}

	@Test(priority = -16, invocationCount = 3,groups="reg")

	private void tc6() {
		System.out.println("test case 6");

	}
}
