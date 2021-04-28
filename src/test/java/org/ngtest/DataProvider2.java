package org.ngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@Test(dataProvider="vino")
	public void testMethod(String S1, String S2) {
	   
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse proton\\FrameworkTest\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
        WebElement txtUser=driver.findElement(By.id("username"));
        txtUser.sendKeys(S1);
        WebElement txtPass=driver.findElement(By.id("password"));
        txtPass.sendKeys(S2);
        WebElement btnLogin=driver.findElement(By.id("login"));
        btnLogin.click();
        driver.quit();
	}     
        @DataProvider(name="vino")
        public Object[][] dataMethod(){
         return new Object[][] {{"vinothkumar","welcome1"},{"vijay","welcome2"},{"kavi","welcome3"},{"vicky","welcome4"},{"kumar","welcome5"},{"narman","welcome6"},{"sharief","welcome7"},{"arun","welcome8"},{"edwin","welcome9"},{"gobi","welcome10"}};
        
        }
}
