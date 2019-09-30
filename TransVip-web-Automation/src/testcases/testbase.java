package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Xls_Reader;

public class testbase {

	public static WebDriver driver;
	public static Xls_Reader xls = new Xls_Reader("/Users/sticker-148/eclipse-workspace/Transvip-automation/TransVip-web-Automation/src/data/Selenium_TestCases_transvip.xls");

	   
	public void init() {
		System.out.println("launching Chrome browser"); 
		System.setProperty("webdriver.chrome.driver","/Users/sticker-148/eclipse-workspace/Transvip-automation/TransVip-web-Automation/src/data/chromedriver");
		driver = new ChromeDriver();
	}
	
}
