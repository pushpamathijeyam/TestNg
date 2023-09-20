package org.sample;

import org.testng.annotations.Test;

public class DependsOnDemo {
	@Test
	public void tc2() {
		System.out.println(5 / 0);
	}

	@Test(dependsOnMethods="tc2",alwaysRun=true)
	public void tc1() {
		System.out.println("test case 1");
	}

	@Test(dependsOnMethods="tc2",alwaysRun=true)
	public void tc3() {
		System.out.println("test case3");
	}

}
