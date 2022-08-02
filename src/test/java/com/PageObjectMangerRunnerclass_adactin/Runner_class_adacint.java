package com.PageObjectMangerRunnerclass_adactin;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.POM_Project_adacint.Bookhotel_Page;
import com.POM_Project_adacint.Login_Page;
import com.POM_Project_adacint.Search_Page;
import com.PageObjectManager_Project.adactin.PageObjectManager;
import com.Utility_Project.Utilityclass;
import com.logger.Logger_class;

public class Runner_class_adacint extends Utilityclass {

	public static WebDriver driver=Utilityclass.get_Browser("Chrome");
	public static PageObjectManager ob=new PageObjectManager(driver);
	public static void login_Btn() throws IOException {
		
		implicit_wait(10);
		String username = particular_cell("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project\\vijay.xlsx",0,0,1);
		String password = particular_cell("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Maven_Project\\\\vijay.xlsx",0,1,1);
		send_Keys(ob.getLp().getUsername(),username);
		send_Keys(ob.getLp().getPassword(),password);
		click(ob.getLp().getLogin());		
		//Thread.sleep(2000);
		
		
	}
	public static void searchhotel() throws InterruptedException {
		
		implicit_wait(10);
		Dropdownis_Multiple(ob.getSp().getLocation());
		System.out.println(Dropdownis_Multiple(ob.getSp().getLocation()));
		dropDownselect(ob.getSp().getLocation(),"index","2");
		WebElement firstoption = getFirstSelectOption(ob.getSp().getLocation());
		firstoption.click();
		//Thread.sleep(2000);
		
		Dropdownis_Multiple(ob.getSp().getHotel());
		System.out.println(Dropdownis_Multiple(ob.getSp().getHotel()));
		dropDownselect(ob.getSp().getHotel(),"index","2");
		WebElement secondOption = getFirstSelectOption(ob.getSp().getHotel());
		secondOption.click();
		//Thread.sleep(2000);
		
		
		Dropdownis_Multiple(ob.getSp().getRoomtype());
		System.out.println(Dropdownis_Multiple(ob.getSp().getRoomtype()));
		dropDownselect(ob.getSp().getRoomtype(),"index","3");
		WebElement thridoption = getFirstSelectOption(ob.getSp().getRoomtype());
		thridoption.click();
		//Thread.sleep(2000);
	
		System.out.println(Dropdownis_Multiple(ob.getSp().getNoroom()));
		dropDownselect(ob.getSp().getNoroom(),"value","4");
		WebElement forthoption = getFirstSelectOption(ob.getSp().getNoroom());
		forthoption.click();
		//Thread.sleep(2000);
		
		System.out.println(Dropdownis_Multiple(ob.getSp().getAdult()));
		dropDownselect(ob.getSp().getAdult(),"visible","2 - Two");
		WebElement fifthoption = getFirstSelectOption(ob.getSp().getAdult());
		fifthoption.click();
		//Thread.sleep(2000);

		System.out.println(Dropdownis_Multiple(ob.getSp().getChild()));
		dropDownselect(ob.getSp().getChild(),"value","2");
		WebElement sixoption = getFirstSelectOption(ob.getSp().getChild());
		sixoption.click();
		//Thread.sleep(2000);
		
		click(ob.getSp().getSearch());
		//Thread.sleep(2000);
		
		click(ob.getSp().getRadio());
		
		click(ob.getSp().getContine());
		
		//Thread.sleep(2000);

		
	}
	
	public static void bookhotel() throws InterruptedException {
		
		send_Keys(ob.getBp().getFirstname(),"Vijay");
		send_Keys(ob.getBp().getLastname(),"Ganesh");
		Thread.sleep(2000);
		
		send_Keys(ob.getBp().getBilladdress(),"Oldwashermenpet");
		
		send_Keys(ob.getBp().getCreditno(),"1234456478967896");
		
		System.out.println(Dropdownis_Multiple(ob.getBp().getCredittype()));
		dropDownselect(ob.getBp().getCredittype(),"index","2");
		WebElement sevenoption = getFirstSelectOption(ob.getBp().getCredittype());
		sevenoption.click();
		
		System.out.println(Dropdownis_Multiple(ob.getBp().getMonth()));
		dropDownselect(ob.getBp().getMonth(),"value","3");
		WebElement eightoption = getFirstSelectOption(ob.getBp().getMonth());
		eightoption.click();
		
		System.out.println(Dropdownis_Multiple(ob.getBp().getYear()));
		dropDownselect(ob.getBp().getYear(),"visible","2014");
		WebElement ninthoption = getFirstSelectOption(ob.getBp().getYear());
		ninthoption.click();
		
		send_Keys(ob.getBp().getCvv(),"123");
		
		
		click(ob.getBp().getBookNow());
		Thread.sleep(5000);
		
		click(ob.getBp().getMyitinerary());
		
		
	}
	
	public static void again_Search() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchhotel = driver.findElement(By.xpath("//a[.='Search Hotel']"));
		searchhotel.click();
		
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s1=new Select(location);
		s1.isMultiple();
		System.out.println(s1.isMultiple());
		s1.selectByIndex(5);
		WebElement firstoption = s1.getFirstSelectedOption();
		firstoption.click();
		Thread.sleep(2000);
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2=new Select(hotel);
		System.out.println(s2.isMultiple());
		s2.selectByIndex(3);
		WebElement secondOption = s2.getFirstSelectedOption();
		secondOption.click();
		Thread.sleep(2000);
		
		WebElement roomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s3=new Select(roomtype);
		System.out.println(s3.isMultiple());
		s3.selectByIndex(3);
		WebElement thridoption = s3.getFirstSelectedOption();
		thridoption.click();
		Thread.sleep(2000);
		
		WebElement noroom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s4=new Select(noroom);
		System.out.println(s4.isMultiple());
		s4.selectByValue("4");
		WebElement forthoption = s4.getFirstSelectedOption();
		forthoption.click();
		Thread.sleep(2000);
		
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("18/07/2022");
		
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("21/07/2022");
		
		
		
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s5=new Select(adult);
		System.out.println(s5.isMultiple());
		s5.selectByVisibleText("2 - Two");
		WebElement fifthoption = s5.getFirstSelectedOption();
		fifthoption.click();
		Thread.sleep(2000);
		
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s6=new Select(child);
		System.out.println(s6.isMultiple());
		s6.selectByValue("2");
		WebElement sixoption = s6.getFirstSelectedOption();
		sixoption.click();
		Thread.sleep(2000);
		
		
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		Thread.sleep(2000);
		
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));
		radio.click();
		
		WebElement contine = driver.findElement(By.xpath("//input[@id='continue']"));
		contine.click();
		
		Thread.sleep(2000);
		
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		PropertyConfigurator.configure("log4j.properties");
		
		get_url("https://adactinhotelapp.com/SearchHotel.php");
		maximize();
		login_Btn();
		searchhotel();
		bookhotel();
		//again_Search();
		//bookhotel();
		
		
		
		
	}
}
