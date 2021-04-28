package org.ngtest;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReport extends BaseClass {

	
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;
	@BeforeClass
	private void beforeClass() {
		reports = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("AdactinE2Ehtml");
		reports.attachReporter(htmlReporter);
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
		}
	@BeforeMethod
	private void beforemethod() {
		Date date = new Date();
		System.out.println(date);
		}
	@AfterMethod
		private void aftermethod(WebElement logo,Method method) throws IOException {
			screenShot(logo, method.getName());
	
	}
	@Test
	private void toc() throws IOException {
		test = reports.createTest("Validity home page of adactin");
		test.log(Status.INFO, "Verfiing Url od Adactin page");
		if (driver.getCurrentUrl().contains("index")) {
			test.log(Status.PASS, "Valid Url");
		} else {
			test.log(Status.FAIL, "Invalid url");
		}
		WebElement logo = driver.findElement(By.className("logo"));
		if (logo.isDisplayed()) {
			test.log(Status.PASS, "Adactin log is present on home page");
			File screenshotAs = logo.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("logo.png"));
			test.addScreenCaptureFromPath("logo.png");	
		} else {
			test.log(Status.FAIL, "Adactin log is Not present on home page");
			}
	}
	@Test
	private void tc1() {
		test=reports.createTest("Entering UserName and Passwors");
		WebElement txtUserName = driver.findElement(By.id("username"));
		WebElement txtPass = driver.findElement(By.id("password"));
		test.log(Status.INFO, "validity username field");
		test.log(Status.INFO, "validity password field");
		if (txtUserName.isEnabled()) {
			test.log(Status.PASS, "username field box is enabled and disply");
			txtUserName.sendKeys("vinothkumar");
		} else {
			test.log(Status.FAIL, "password field box is not enabled and not display");
		}
		if (txtPass.isEnabled()) {
			test.log(Status.PASS, "password field box is enabled and disply");
			txtPass.sendKeys("1234565");
		} else {
			test.log(Status.FAIL, "password field box is not enabled and not display");

		}
	}
	@AfterClass
	private void afterclass() {
		reports.flush();
	}
	
}
