package org.ngtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BaseClassWithTestng extends BaseClass{
	
@Test
	public void register() throws IOException, InterruptedException {
	BaseClass b = new BaseClass();
	b.getDriver();
	b.launchUrl("http://demo.automationtesting.in/Register.html");
	b.enterText(driver.findElement(By.xpath("//input[@placeholder='First Name']")) , b.excelRead(1, 0));
	b.enterText(driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")), b.excelRead(1, 1));
	b.enterText(driver.findElement(By.xpath("//textarea[@rows=\"3\"]")), b.excelRead(1, 2));
	b.enterText(driver.findElement(By.xpath("//*[@id=\"eid\"]/input")), b.excelRead(1, 3));
	b.enterText(driver.findElement(By.xpath("//input[@type=\"tel\"]")), b.excelRead(1, 4));
	b.btnClick(driver.findElement(By.xpath("//input[@type=\"radio\"]")));
	b.btnClick(driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")));
	b.btnClick(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
	b.btnClick(driver.findElement(By.xpath("//a[text()='English']")));
	b.btnClick(driver.findElement(By.xpath("//option[text()='Java']")));
	b.btnClick(driver.findElement(By.xpath("//option[text()='India']")));
	b.btnClick(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span/span[2]")));
	b.btnClick(driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")));
	b.btnClick(driver.findElement(By.xpath("//option[text()='1993']")));
	b.btnClick(driver.findElement(By.xpath("//option[text()='August']")));
	b.btnClick(driver.findElement(By.xpath("//option[text()='18']")));
	b.enterText(driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")), b.excelRead(1, 5));
	b.enterText(driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")), b.excelRead(1, 6));
	b.excelWrite(1, 7, "sathish");
	}
	
}
