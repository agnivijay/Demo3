package com.POM_Project_adacint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noroom;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child;
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement contine;
	
	
	
	public Search_Page(WebDriver driver2) {

	this.driver=driver2;
	
	PageFactory.initElements(driver,this);
	
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoroom() {
		return noroom;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContine() {
		return contine;
	}
	
	
	
	
}
