package com.testng_features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjectManager_Project.adactin.PageObjectManager;
import com.Utility_Project.Utilityclass;

public class Retry_methods extends Utilityclass{
	
	public static WebDriver driver=Utilityclass.get_Browser("chrome");
	
	public static PageObjectManager manager=new PageObjectManager(driver);
	
	
	@Test(retryAnalyzer = Rerun_purpose.class)
	private void adactin() {
		get_url("https://adactinhotelapp.com/SearchHotel.php");
		send_Keys(manager.getLp().getUsername(),"username");
		send_Keys(manager.getLp().getPassword(),"password");
		String expected_Url="https://adactinhotelapp.com/searchHotel.php";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, expected_Url);
		System.out.println("Hotel purchase");
	}
	
	
	
	

}
