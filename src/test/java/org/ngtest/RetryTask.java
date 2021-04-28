package org.ngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTask {

	@Test(retryAnalyzer = Execute.class)
	private void test1() {
		Assert.assertTrue(false);
	}
	@Test
	private void test5() {
		Assert.assertTrue(true);
	}
	@Test(retryAnalyzer = Execute.class)
	private void test3() {
		Assert.assertTrue(false);
	}
}
