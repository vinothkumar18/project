package org.ngtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdatinTest extends BaseClass{
	
	public AdatinTest() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtusername;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(name="login")
	private WebElement btnlogin;
	@FindBy(id="location")
	private WebElement btnclick;
	@FindBy(id="hotels")
	private WebElement btnclick1;
	@FindBy(id="room_type")
	private WebElement btnclick2;
	@FindBy(id="room_nos")
	private WebElement btnclick3;
	@FindBy(name ="datepick_in")
	private WebElement txtdate;
	@FindBy(id="datepick_out")
	private WebElement txtDate1;
	@FindBy(id="adult_room")
	private WebElement btnclick4;
	@FindBy(id="child_room")
	private WebElement btnclick5;
	@FindBy(id="Submit")
	private WebElement btnsearch;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;
	@FindBy(id="continue")
	private WebElement conbtn;
	@FindBy(id="first_name")
	private WebElement fn;
	public WebElement getFn() {
		return fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCcn() {
		return ccn;
	}
	public WebElement getCtype() {
		return ctype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBtnbook() {
		return btnbook;
	}

	@FindBy(id="last_name")
	private WebElement ln;
	@FindBy(id="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement ccn;
	@FindBy(id="cc_type")
	private WebElement ctype;
	@FindBy(id ="cc_exp_month")
	private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement btnbook;
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement lg;
	
		public WebElement getLg() {
		return lg;
	}
		public WebElement getConbtn() {
		return conbtn;
	}
		public WebElement getRadiobtn() {
		return radiobtn;
	}
		public WebElement getBtnsearch() {
		return btnsearch;
	}
		public WebElement getBtnclick5() {
		return btnclick5;
	}
		public WebElement getBtnclick4() {
		return btnclick4;
	}
		public WebElement getTxtDate1() {
		return txtDate1;
	}
		public WebElement getTxtdate() {
		return txtdate;
	}
		public WebElement getBtnclick3() {
		return btnclick3;
	}
		public WebElement getBtnclick2() {
		return btnclick2;
	}
		public WebElement getBtnclick1() {
		return btnclick1;
	}
		public WebElement getTxtlocation() {
		return btnclick;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
}
