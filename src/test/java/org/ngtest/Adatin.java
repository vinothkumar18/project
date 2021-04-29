package org.ngtest;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adatin {

	WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\TestNGMethodGrp\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		}
	@AfterMethod
	private void afterMethod1() {
		Date date = new Date();
		System.out.println(date);
	}
	@BeforeMethod
	private void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@AfterClass
	private void afterMethod() {
		Date date = new Date();
		System.out.println(date);
		
		}
	@Test
	public void Adatin() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("vinoth");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("12345");
		WebElement btnClick = driver.findElement(By.name("login"));
		btnClick.click();
		}
	
}
