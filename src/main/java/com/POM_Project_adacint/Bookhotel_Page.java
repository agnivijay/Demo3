package com.POM_Project_adacint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel_Page {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billaddress;
	@FindBy(xpath = "//input[@type='text'and@id='cc_num']")
	private WebElement creditno;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement credittype;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement month;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNow;
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myitinerary;
	//parameterized constructor
	public Bookhotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBilladdress() {
		return billaddress;
	}
	public WebElement getCreditno() {
		return creditno;
	}
	public WebElement getCredittype() {
		return credittype;
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
	public WebElement getBookNow() {
		return bookNow;
	}
	public WebElement getMyitinerary() {
		return myitinerary;
	}
	
	
	
}
