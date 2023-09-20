package org.sample;

import org.testng.annotations.Test;

public class Sample3 {
	@Test(invocationCount = 5,groups="smoke")
	private void tc7() {
		System.out.println("test case 7");
	}

}
