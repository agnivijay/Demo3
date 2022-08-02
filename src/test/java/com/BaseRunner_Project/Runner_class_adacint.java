package com.BaseRunner_Project;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Utility_Project.Utilityclass;

public class Runner_class_adacint extends Utilityclass {

	public static WebDriver driver;
	
	public static void searchhotel() throws InterruptedException {
		
		implicit_wait(10);
		WebElement location = find_Element("//select[@id='location']");
		Dropdownis_Multiple(location);
		System.out.println(Dropdownis_Multiple(location));
		dropDownselect(location,"index","2");
		WebElement firstoption = getFirstSelectOption(location);
		firstoption.click();
		//Thread.sleep(2000);
		
		WebElement hotel = find_Element("//select[@id='hotels']");
		Dropdownis_Multiple(hotel);
		System.out.println(Dropdownis_Multiple(hotel));
		dropDownselect(hotel,"index","2");
		WebElement secondOption = getFirstSelectOption(hotel);
		secondOption.click();
		//Thread.sleep(2000);
		
		
		WebElement roomtype = find_Element("//select[@id='room_type']");
		Dropdownis_Multiple(roomtype);
		System.out.println(Dropdownis_Multiple(roomtype));
		dropDownselect(roomtype,"index","3");
		WebElement thridoption = getFirstSelectOption(roomtype);
		thridoption.click();
		//Thread.sleep(2000);
		
		WebElement noroom = find_Element("//select[@id='room_nos']");
		System.out.println(Dropdownis_Multiple(noroom));
		dropDownselect(noroom,"value","4");
		WebElement forthoption = getFirstSelectOption(noroom);
		forthoption.click();
		//Thread.sleep(2000);
		
		WebElement adult = find_Element("//select[@id='adult_room']");
		Select s5=new Select(adult);
		System.out.println(Dropdownis_Multiple(adult));
		dropDownselect(adult,"visible","2 - Two");
		WebElement fifthoption = getFirstSelectOption(adult);
		fifthoption.click();
		//Thread.sleep(2000);

		WebElement child = find_Element("//select[@id='child_room']");
		Select s6=new Select(child);
		System.out.println(Dropdownis_Multiple(child));
		dropDownselect(child,"value","2");
		WebElement sixoption = getFirstSelectOption(child);
		sixoption.click();
		//Thread.sleep(2000);
		
		WebElement search = find_Element("//input[@id='Submit']");
		search.click();
		//Thread.sleep(2000);
		
		WebElement radio = find_Element("//input[@type='radio']");
		radio.click();
		
		WebElement contine = find_Element("//input[@id='continue']");
		contine.click();
		
		//Thread.sleep(2000);

		
	}
	
	public static void bookhotel() throws InterruptedException, IOException {
		
		WebElement firstname = find_Element("//input[@id='first_name']");
		send_Keys(firstname,"Vijay");
		WebElement lastname = find_Element("//input[@id='last_name']");
		send_Keys(lastname,"Ganesh");
		Thread.sleep(2000);
		
		WebElement billaddress = find_Element("//textarea[@id='address']");
		send_Keys(billaddress,"Oldwashermenpet");
		
		WebElement creditno = find_Element("//input[@type='text'and@id='cc_num']");
		send_Keys(creditno,"1234456478967896");
		
		WebElement credittype = find_Element("//select[@id='cc_type']");
		System.out.println(Dropdownis_Multiple(credittype));
		dropDownselect(credittype,"index","2");
		WebElement sevenoption = getFirstSelectOption(credittype);
		sevenoption.click();
		
		WebElement month = find_Element("//select[@id='cc_exp_month']");
		System.out.println(Dropdownis_Multiple(month));
		dropDownselect(month,"value","3");
		WebElement eightoption = getFirstSelectOption(month);
		eightoption.click();
		
		WebElement year = find_Element("//select[@id='cc_exp_year']");
		System.out.println(Dropdownis_Multiple(year));
		dropDownselect(year,"visible","2014");
		WebElement ninthoption = getFirstSelectOption(year);
		ninthoption.click();
		
		WebElement cvv = find_Element("//input[@id='cc_cvv']");
		send_Keys(cvv,"123");
		
		
		WebElement bookNow = find_Element("//input[@id='book_now']");
		click(bookNow);
		Thread.sleep(5000);
		
		WebElement my_itinerary = find_Element("//input[@id='my_itinerary']");
		click(my_itinerary);
		Thread.sleep(2000);
		Take_Screenshot("C:\\Users\\DELL\\eclipse-workspace\\Maven_Project\\Snap\\b.png");
		
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
		driver=get_Browser("Chrome");
		get_url("https://adactinhotelapp.com/SearchHotel.php");
		maximize();
		WebElement username = find_Element("//input[@id='username']");
		send_Keys(username,"Ganeshvijay");
		WebElement password = find_Element("//input[@id='password']");
		send_Keys(password,"password");
		WebElement login = find_Element("//input[@id='login']");
		click(login);		
		Thread.sleep(2000);
		
		searchhotel();
		bookhotel();
		//again_Search();
		//bookhotel();
		
		
		
		
	}
}
