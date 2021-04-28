package org.ngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutoDemo extends BaseClass {

	WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\TestNGMethodGrp\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	@Test
	@Parameters({"FirstName","LastName","Address","mail","Phone","Skill","Country"})
	
	private void test(String FirstName,String LastName,String Address,String mail,String Phone,String Skill,String Country) {
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("FirstName");
		
		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("LastName");
		
		WebElement txtAdress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAdress.sendKeys("Address");
		
		WebElement txtMail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		txtMail.sendKeys("mail");

		WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		txtPhone.sendKeys("Phone");
		
		WebElement bntGen = driver.findElement(By.xpath("//input[@ng-model='radiovalue']"));
		bntGen.click();
		
		WebElement bntHob = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		bntHob.click();
		
		WebElement txtLang = driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
		txtLang.click();
		WebElement txtEng = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		txtEng.click();
		
		WebElement txtSkill = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		txtSkill.sendKeys("Skill");
		
		WebElement txtJava = driver.findElement(By.xpath("//select[@id=\"Skills\"]/option[39]"));
		txtJava.click();
		
		WebElement txtCount = driver.findElement(By.xpath("//select[@id=\"countries\"]"));
		txtCount.sendKeys("Country");
		
		WebElement txtIndia = driver.findElement(By.xpath("//select[@id=\"countries\"]/option[106] "));
		txtIndia.click();
		
		WebElement txtSc = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		txtSc.sendKeys("India");
		
		WebElement btnClick = driver.findElement(By.xpath("//*[@id=\"select2-country-container\"]"));
		btnClick.click();
		
		WebElement txtCs = driver.findElement(By.xpath("//button[@id=\"submitbtn\"]"));
		txtCs.click();
		
		WebElement txtDOB = driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[79]"));
		txtDOB.click();
		
		WebElement txtMon = driver.findElement(By.xpath("//*[@ng-model='monthbox']/option[9]"));
		txtMon.click();
		
		WebElement txtDay = driver.findElement(By.xpath("//*[@ng-model=\"daybox\"]/option[19]"));
		txtDay.click();
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		txtPass.sendKeys("123456");
		
		WebElement txtCpass = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		txtCpass.sendKeys("123456");
		
		WebElement btnSub = driver.findElement(By.xpath("//button[@name=\"signup\"]"));
		btnSub.click();
		
	}
}
