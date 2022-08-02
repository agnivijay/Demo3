package com.BaseRunner_Project;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.POM_Project_adacint.Login_Page;

public class Runner_class_automation {
	public static WebDriver driver;
	public static void create_Account() throws InterruptedException{
		
		WebElement Sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		Thread.sleep(3000);
		Sign_in.click();
		
		
		
		WebElement enter_email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		enter_email.sendKeys("abcadfd@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement create = driver.findElement(By.xpath("//i[@class='icon-user left']"));
		Thread.sleep(3000);
		create.click();
		Thread.sleep(3000);
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Thread.sleep(3000);
		male.click();
		boolean maleselected = male.isSelected();
		System.out.println("Male Selected or not:"+maleselected);
		Thread.sleep(3000);
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Thread.sleep(3000);
		female.click();
		boolean femaleselected = female.isSelected();
		System.out.println("Female selected or not:"+femaleselected);
		boolean maleselected2 = male.isSelected();
		System.out.println("Male Selected or not:"+maleselected2);
		
		
		WebElement firstName = driver.findElement(By.xpath("(//input[@id='customer_firstname'])[1]"));
		firstName.sendKeys("Vijay");
		
		
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@id='customer_lastname'])[1]"));
		lastname.sendKeys("Perumal");
		
		WebElement password = driver.findElement(By.xpath("(//input[@id='passwd'])[1]"));
		password.sendKeys("Vijay1996");
		
		WebElement days = driver.findElement(By.xpath("(//select[@id='days'])[1]"));
		Select s=new Select(days);
		boolean Dropdown1 = s.isMultiple();
		System.out.println("Dropdown single or multiple:"+Dropdown1);
		s.selectByIndex(16);
		WebElement a = s.getFirstSelectedOption();
		a.click();

		WebElement months = driver.findElement(By.xpath("(//select[@id='months'])[1]"));
		Select s1=new Select(months);
		boolean Dropdown2 = s.isMultiple();
		System.out.println("Dropdown single or multiple:"+Dropdown2);
		s1.selectByValue("3");

		WebElement years = driver.findElement(By.xpath("(//select[@id='years'])[1]"));
		//Thread.sleep(2000);
		Select s2=new Select(years);
		//Thread.sleep(2000);
		boolean Dropdown3 = s.isMultiple();
		System.out.println("Dropdown single or multiple:"+Dropdown3);
		s2.selectByIndex(30);
		
		WebElement check1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		check1.click();
		
		WebElement check2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		check2.click();
		
		WebElement company = driver.findElement(By.xpath("(//input[@id='company'])[1]"));
		company.sendKeys("Hunganme Sloution");
		
		WebElement address1 = driver.findElement(By.xpath("(//input[@id='address1'])[1]"));
		address1.sendKeys("T.Nagar");
		
		WebElement address2 = driver.findElement(By.xpath("(//input[@id='address2'])[1]"));
		address2.sendKeys("Vadapalani");
		
		WebElement city = driver.findElement(By.xpath("(//input[@id='city'])[1]"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.xpath("(//select[@id='id_state'])[1]"));
		Thread.sleep(2000);
		Select s4=new Select(state);
		s4.selectByIndex(32);
		WebElement fouthopt = s4.getFirstSelectedOption();
		fouthopt.click();
		
		WebElement code = driver.findElement(By.xpath("(//input[@name='postcode'])[1]"));
		code.sendKeys("00000");
		
		WebElement Country = driver.findElement(By.xpath("(//select[@id='id_country'])[1]"));
		Select b=new Select(Country);
		b.selectByIndex(1);
		WebElement c = b.getFirstSelectedOption();
		c.click();
		
		WebElement addinfo = driver.findElement(By.xpath("(//textarea[@id='other'])[1]"));
		addinfo.sendKeys("Nil");
		
		WebElement phone = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
		phone.sendKeys("7876434643");
		Thread.sleep(2000);
		WebElement mobno = driver.findElement(By.xpath("(//input[@id='phone_mobile'])[1]"));
		mobno.sendKeys("46498651348");
		
		WebElement futaddress = driver.findElement(By.xpath("(//input[@id='alias'])[1]"));
		futaddress.sendKeys("Hongkong");
		
		WebElement register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		Thread.sleep(2000);
		register.click();
		
	}
	
	public static void Login_account() throws InterruptedException {

		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		Thread.sleep(3000);
		Sign_in.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abcadfd@gmail.com");
		
		/*Actions a=new Actions(driver);
		
		a.sendKeys(Keys.TAB).build().perform();*/
		
		WebElement passwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		
		passwd.sendKeys("Vijay1996");
		
		WebElement sign_btn = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		sign_btn.click();
		
		
	}
	
	public static void select_purchase_dress() {

		WebElement dresses = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a"));
		
		Actions a=new Actions(driver);
		a.clickAndHold(dresses).build().perform();
		
		WebElement evening = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/ul/li[2]/a"));
		
		evening.click();
		
		WebElement printdress = driver.findElement(By.xpath("//img[@alt='Printed Dress']"));
		printdress.click();	
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
		 driver =new ChromeDriver();
		
		 Login_account();
		 select_purchase_dress();
		
		
		//WebElement printdress = driver.findElement(By.xpath("//a[@class='quick-view']"));
		//printdress.click();
		
		
		
		
		
	}

}
