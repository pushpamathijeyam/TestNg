package org.sample;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(priority = -5, invocationCount = 2,groups="smoke")
	private void tc2() {
		System.out.println("test case 2");

	}

	@Test(groups={"smoke","reg"})
	private void tc1() {
		System.out.println("test case1");

	}

	@Test(groups="sanity")

	private void tc3() {
		System.out.println("test case 3");
	}

}
