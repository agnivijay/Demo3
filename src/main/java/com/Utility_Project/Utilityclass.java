package com.Utility_Project;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilityclass {
	
	public static WebDriver driver;
	//public static Actions a;
	
	public static WebDriver get_Browser(String name) {

		if (name.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\gecko.driver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void get_url(String url) {

		driver.get(url);
	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void implicit_wait(int a) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}

	public static String get_Title() {

		String title = driver.getTitle();
		return title;
	}

	public static String get_Currenturl() {

		String url = driver.getCurrentUrl();
		return url;

	}

	public static String get_PageSource() {

		String pageSource = driver.getPageSource();
		return pageSource;
	}

	public static WebElement find_Element(String name) {

		WebElement findElement = driver.findElement(By.xpath(name));
		return findElement;
	}

	public static List<WebElement> find_Elements(String name) {

		List<WebElement> findElements = driver.findElements(By.xpath(name));
		return findElements;

	}

	public static void click(WebElement element) {

		element.click();
	}

	public static void send_Keys(WebElement element, String name) {

		element.sendKeys(name);

	}

	public void clear(WebElement element) {

		element.clear();
	}

	public static String get_Text(WebElement element) {

		String text = element.getText();
		return text;
	}

	public static boolean is_Displayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static boolean is_Enabled(WebElement element) {

		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean is_Selected(WebElement element) {

		boolean selected = element.isSelected();
		return selected;
	}

	public static String get_Attribute(WebElement element, String name) {

		String attribute = element.getAttribute(name);
		return attribute;
	}

	public static String get_Tagname(WebElement element) {

		String tagname = element.getTagName();
		return tagname;
	}

	public static void click_target_element(WebDriver d, WebElement element) {
		Actions a = new Actions(d);
		a.click(element).build().perform();

	}

	public static void right_Click(WebDriver d, WebElement element) {
		Actions a = new Actions(d);
		a.contextClick(element).build().perform();
	}

	public static void down_And_Enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	
	public static boolean Dropdownis_Multiple(WebElement element) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
		
	}
	

	public static WebElement getFirstSelectOption(WebElement element) {

		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
	public static void dropDownselect(WebElement element,String type,String data) {
			
			Select s=new Select(element);
			if (type.equalsIgnoreCase("visible")) {
				s.selectByVisibleText(data);
			} else if (type.equalsIgnoreCase("value")) {
				s.selectByValue(data);
			} else if (type.equalsIgnoreCase("index")) {
				int value = Integer.parseInt(data);
				s.selectByIndex(value);
			}	

	}
	
	public static List<WebElement> dropDownOption(WebElement element,String type) {
			
		Select s=new Select(element);
		
		List<WebElement> ele = null;
		
		if (type.equalsIgnoreCase("getoptions")) {
			
			ele=s.getOptions();
		} else if (type.equalsIgnoreCase("allselectopt")) {
			
			ele=s.getAllSelectedOptions();
		}
		return ele;
	}
	
	public static void Take_Screenshot(String path) throws IOException {

		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		FileUtils.copyFile(source,destination);
	}
	
	public static void actionClick(WebElement targetele,String type) {

		Actions a=new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			a.click(targetele);
			a.build().perform();
		} else if (type.equalsIgnoreCase("rightclick")) {
			a.contextClick(targetele).build().perform();
			
		} else if (type.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(targetele).build().perform();
		} else if (type.equalsIgnoreCase("clickhold")) {
			a.clickAndHold(targetele).build().perform();
		} else if (type.equalsIgnoreCase("release")) {
			a.release(targetele);
		}
		
	}
	public static void dragDrop(WebElement source,WebElement target) {

		Actions a=new Actions(driver);
		a.dragAndDrop(source, target);
	}
	
	public static void movetoElement(WebElement targetele) {

		Actions a=new Actions(driver);
		a.moveToElement(targetele);
	}
	
public static String particular_cell(String excelpath,int sheetIndex,int rowIndex,int cellIndex) throws IOException {
		String value = null;
		File f=new File(excelpath);
		FileInputStream d=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(d);
		Sheet s = wb.getSheetAt(sheetIndex);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
				
		CellType type = c.getCellType();
				
		if (type.equals(CellType.STRING)) {
					
			value =	 c.getStringCellValue(); 
		} else if (type.equals(CellType.NUMERIC)) {
					
			double numericvalue = c.getNumericCellValue();
			value = String.valueOf(numericvalue);
				}
		
		wb.close();
		return value;
	}
	
 }


 





