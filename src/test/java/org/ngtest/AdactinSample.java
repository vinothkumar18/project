package org.ngtest;

import org.openqa.selenium.WebElement;

public class AdactinSample extends BaseClass {

	public static void main(String[] args) {
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
		
		AdatinTest ad = new AdatinTest();
		
		WebElement txtusername = ad.getTxtusername();
		enterText(txtusername, "karthi007");
		
		WebElement txtpassword = ad.getTxtpassword();
		enterText(txtpassword, "Karthi@1989");
		
		WebElement btnlogin = ad.getBtnlogin();
		btnClick(btnlogin);
		
		WebElement btnclick = ad.getBtnclick();
		btnClick(btnclick);
		ad.selectByVisibleText(btnclick, "New York");
		
		WebElement btnclick1 = ad.getBtnclick1();
		ad.selectByVisibleText(btnclick1, "Hotel Sunshine");
		
		WebElement btnclick2 = ad.getBtnclick2();
		ad.selectByVisibleText(btnclick2, "Deluxe");
		
		WebElement btnclick3 = ad.getBtnclick3();
		ad.selectByValue(btnclick3, "5");
		
		WebElement txtdate = ad.getTxtdate();
		txtdate.clear();
        enterText(txtdate, "27/04/2021");
        
        WebElement txtDate1 = ad.getTxtDate1();
        txtDate1.clear();
        enterText(txtDate1, "30/04/2021");
        
        WebElement btnclick4 = ad.getBtnclick4();
        ad.selectByValue(btnclick4, "3");
        
        WebElement btnclick5 = ad.getBtnclick5();
        ad.selectByValue(btnclick5, "2");
        
        WebElement btnsearch = ad.getBtnsearch();
        btnsearch.click();
        
        WebElement radiobtn = ad.getRadiobtn();
        radiobtn.click();
        
        WebElement conbtn = ad.getConbtn();
        conbtn.click();
        
        WebElement fn = ad.getFn();
        enterText(fn, "vinothkumar");
        
        WebElement ln = ad.getLn();
        enterText(ln, "Muguresan");
        
        WebElement add = ad.getAdd();
        enterText(add, "ECR");
        
        WebElement ccn = ad.getCcn();
        enterText(ccn, "4700258996321478");
        
        WebElement ctype = ad.getCtype();
        ad.selectByVisibleText(ctype, "Master Card");
        
        WebElement month = ad.getMonth();
        ad.selectByValue(month, "8");
        
        WebElement year = ad.getYear();
        ad.selectByValue(year, "2022");
        
        WebElement cvv = ad.getCvv();
        enterText(cvv, "820");
        
        WebElement btnbook = ad.getBtnbook();
        btnbook.click();
        
        WebElement lg = ad.getLg();
        lg.click();
		
		
		
	}
}
