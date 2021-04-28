package org.ngtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;

	

	public static void getDriver() {

	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();

	driver.manage().window().maximize();

	}

	public static  void launchUrl(String data) {

	driver.get(data);

	}

	public static void getText(WebElement element, String data) {

	element.getText();

	}

	public void getAttribute(WebElement element, String data) {

	element.getAttribute(data);

	}

	public void getSiZe(WebElement element) {

	element.getSize();

	}
	public static void screenShot(WebElement element,String data) throws IOException {
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\Eclipse proton\\TestNGTask\\ScreenShot\\logo.png");
		FileUtils.copyFile(screenshotAs, des);
	}

	public static void enterText(WebElement element, String data) {

	element.sendKeys(data);
	}

	public  static void btnClick(WebElement element) {

	element.click();

	}
	

	

	public static void moveToElement(WebElement element) {

	Actions ac = new Actions(driver);

	ac.moveToElement(element).perform();

	}

	public static void dragAndDrop(WebElement element,WebElement element2) {

	Actions ac = new Actions(driver);

	ac.dragAndDrop(element, element2);

	}

	public static void rightClick(WebElement element) {

	Actions ac = new Actions(driver);

	ac.contextClick(element).perform();

	}

	public static void doubleClick(WebElement element) {

	Actions ac = new Actions(driver);

	ac.doubleClick(element).perform();

	}

	public static void keyUpAndKeyDown(WebElement element, String data) {

	Actions ac = new Actions(driver);

	ac.keyDown(element, Keys.SHIFT).sendKeys(element, data).keyUp(element, Keys.SHIFT).perform();

	}

	public static void simpleAlerts() {

	Alert as = driver.switchTo().alert();

	as.accept();

	}

	public static void promptAlerts() {

	Alert as = driver.switchTo().alert();

	as.accept();

	as.dismiss();

	}

	public static void confirmAlerts(String data) {

	Alert as = driver.switchTo().alert();

	as.accept();

	as.dismiss();

	as.sendKeys(data);

	}

		

	public static void enterTextByJs(String data, WebElement element) {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("arguments[0].setAtribute('value','"+data+"')", element);

	}

	public static void getTextByJs(String data, WebElement element) {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("arguments[0].getAtribute('value','"+data+"')", element);

	}

	public static void ClickByJs(String data, WebElement element) {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("arguments[0].Click()", element);

	}

	public static void scrollDownByJs(String data, WebElement element) {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("arguments[0].ScrollIntoView(true)", element);

	}

	public static void scrollUpByJs(String data, WebElement element) {

	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("arguments[0].ScrollIntoView(false)", element);

	}

	public static void selectByIndex(WebElement element, int number) {

	Select se = new Select(element);

	se.selectByIndex(number);	

	}

	public static void selectByValue(WebElement element, String value) {

	Select se = new Select(element);

	se.selectByValue(value);

	}

	public static void selectByVisibleText(WebElement element, String value) {

	Select se = new Select(element);

	se.selectByVisibleText(value);

	}

	public static void deselectByIndex(WebElement element, int number) {

	Select se = new Select(element);

	se.deselectByIndex(number);	

	}

	public static void deselectByValue(WebElement element, String value) {

	Select se = new Select(element);

	se.deselectByValue(value);

	}

	public static void deselectByVisibleText(WebElement element, String value) {

	Select se = new Select(element);

	se.deselectByVisibleText(value);

	}

	public static void getOptionsBySelect(WebElement element) {

	Select se = new Select(element);

	se.getOptions();

	}

	public static void getAllOptionsBySelect(WebElement element) {

	Select se = new Select(element);

	se.getAllSelectedOptions();

	}

	public static void getFirstSelectedBySelect(WebElement element) {

	Select se = new Select(element);

	se.getFirstSelectedOption();

	}

	public void isMultipleBySelect(WebElement element) {

	Select se = new Select(element);

	se.isMultiple();

	}

	public void deSelectBySelect(WebElement element) {

	Select se = new Select(element);

	se.deselectAll();

	}

	public void frameMethodnumber(int number) {

	driver.switchTo().frame(number);

	}

	public void frameMethoddata(String Data) {

	driver.switchTo().frame(Data);

	}

	public void frameMethoddata(WebElement element) {

	driver.switchTo().frame(element);

	}

	public void defaultContent() {	

	driver.switchTo().defaultContent();

	}

	public void frameParentFrame() {

	driver.switchTo().parentFrame();	

	}

	public WebElement findElementByid(String data) {

	WebElement findElement = driver.findElement(By.id(data));

	return findElement;

	}

	public WebElement findElementByName(String data) {

	WebElement findElement = driver.findElement(By.name(data));

	return findElement;
	}
	
	
	public static String excelRead(int rowNo, int cellNo) throws IOException {
		File file = new File("E:\\Eclipse proton\\TestNGTask\\Excel\\vino.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int cellType = c.getCellType();
		String value="";
		if (cellType==1) {
			value = c.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY"); 
			value= format.format(dateCellValue);
		}else {
			double numericCellValue = c.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
		return value;
		
	}
	public static void clear(WebElement element) {
		element.clear();
	}

	public static void excelWrite(int rowNo, int cellNo,String text) throws IOException {
		File file = new File("E:\\Eclipse proton\\TestNGTask\\Excel\\vino.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row row = s.getRow(rowNo);
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(text);
		FileOutputStream f= new FileOutputStream(file);
		w.write(f);
		

	}
	}
	

