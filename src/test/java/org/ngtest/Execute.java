package org.ngtest;

import org.testng.ITestResult;

public class Execute {

	int min = 0, max = 10;
	
	public boolean retry(ITestResult argo) {
		if (min < max) {
			min++;
			return true;
		}
		return false;
	}
}
