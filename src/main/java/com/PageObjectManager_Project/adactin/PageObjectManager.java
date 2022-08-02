package com.PageObjectManager_Project.adactin;

import org.openqa.selenium.WebDriver;

import com.POM_Project_adacint.Bookhotel_Page;
import com.POM_Project_adacint.Login_Page;
import com.POM_Project_adacint.Search_Page;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private Search_Page sp;
	private Login_Page lp;
	private Bookhotel_Page bp;
	
	
	
		
		
	public PageObjectManager(WebDriver driver2) {
		
		this.driver=driver2;
		
	}
	public Search_Page getSp() {
		if (sp==null) {
			sp=new Search_Page(driver);
		}
		
		
		return sp;
	}
	public Login_Page getLp() {
		if (lp==null) {
			lp=new Login_Page(driver);
		}
		return lp;
	}
	public Bookhotel_Page getBp() {
		if (bp==null) {
			bp=new Bookhotel_Page(driver);
		}
		return bp;
	}
	

}
