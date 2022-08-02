package com.POMRunner_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.POM_Project_adacint.Bookhotel_Page;
import com.POM_Project_adacint.Login_Page;
import com.POM_Project_adacint.Search_Page;
import com.Utility_Project.Utilityclass;

public class Runner_class_adacint extends Utilityclass {

	public static WebDriver driver=Utilityclass.get_Browser("Chrome");
	
	public static Search_Page sp=new Search_Page(driver);
	
	public static Login_Page lp=new Login_Page(driver);

	public static Bookhotel_Page bp=new Bookhotel_Page(driver);
	public static void login_Btn() {
		
		implicit_wait(10);
		send_Keys(lp.getUsername(),"Ganeshvijay");
		send_Keys(lp.getPassword(),"password");
		click(lp.getLogin());		
		//Thread.sleep(2000);
		
		
	}
	public static void searchhotel() throws InterruptedException {
		
		implicit_wait(10);
		Dropdownis_Multiple(sp.getLocation());
		System.out.println(Dropdownis_Multiple(sp.getLocation()));
		dropDownselect(sp.getLocation(),"index","2");
		WebElement firstoption = getFirstSelectOption(sp.getLocation());
		firstoption.click();
		//Thread.sleep(2000);
		
		Dropdownis_Multiple(sp.getHotel());
		System.out.println(Dropdownis_Multiple(sp.getHotel()));
		dropDownselect(sp.getHotel(),"index","2");
		WebElement secondOption = getFirstSelectOption(sp.getHotel());
		secondOption.click();
		//Thread.sleep(2000);
		
		
		Dropdownis_Multiple(sp.getRoomtype());
		System.out.println(Dropdownis_Multiple(sp.getRoomtype()));
		dropDownselect(sp.getRoomtype(),"index","3");
		WebElement thridoption = getFirstSelectOption(sp.getRoomtype());
		thridoption.click();
		//Thread.sleep(2000);
	
		System.out.println(Dropdownis_Multiple(sp.getNoroom()));
		dropDownselect(sp.getNoroom(),"value","4");
		WebElement forthoption = getFirstSelectOption(sp.getNoroom());
		forthoption.click();
		//Thread.sleep(2000);
		
		System.out.println(Dropdownis_Multiple(sp.getAdult()));
		dropDownselect(sp.getAdult(),"visible","2 - Two");
		WebElement fifthoption = getFirstSelectOption(sp.getAdult());
		fifthoption.click();
		//Thread.sleep(2000);

		System.out.println(Dropdownis_Multiple(sp.getChild()));
		dropDownselect(sp.getChild(),"value","2");
		WebElement sixoption = getFirstSelectOption(sp.getChild());
		sixoption.click();
		//Thread.sleep(2000);
		
		click(sp.getSearch());
		//Thread.sleep(2000);
		
		click(sp.getRadio());
		
		click(sp.getContine());
		
		//Thread.sleep(2000);

		
	}
	
	public static void bookhotel() throws InterruptedException {
		
		send_Keys(bp.getFirstname(),"Vijay");
		send_Keys(bp.getLastname(),"Ganesh");
		Thread.sleep(2000);
		
		send_Keys(bp.getBilladdress(),"Oldwashermenpet");
		
		send_Keys(bp.getCreditno(),"1234456478967896");
		
		System.out.println(Dropdownis_Multiple(bp.getCredittype()));
		dropDownselect(bp.getCredittype(),"index","2");
		WebElement sevenoption = getFirstSelectOption(bp.getCredittype());
		sevenoption.click();
		
		System.out.println(Dropdownis_Multiple(bp.getMonth()));
		dropDownselect(bp.getMonth(),"value","3");
		WebElement eightoption = getFirstSelectOption(bp.getMonth());
		eightoption.click();
		
		System.out.println(Dropdownis_Multiple(bp.getYear()));
		dropDownselect(bp.getYear(),"visible","2014");
		WebElement ninthoption = getFirstSelectOption(bp.getYear());
		ninthoption.click();
		
		send_Keys(bp.getCvv(),"123");
		
		
		click(bp.getBookNow());
		Thread.sleep(5000);
		
		click(bp.getMyitinerary());
		
		
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
	public static void main(String[] args) throws InterruptedException {
		get_url("https://adactinhotelapp.com/SearchHotel.php");
		maximize();
		login_Btn();
		searchhotel();
		bookhotel();
		//again_Search();
		//bookhotel();
		
		
		
		
	}
}
