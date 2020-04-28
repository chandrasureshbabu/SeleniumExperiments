package Locators_02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_Contains_Xpath10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.lambdatest.com/blog/complete-guide-for-using-xpath-in-selenium-with-examples/");
		
		driver.findElementByXPath(("//a[contains(text(),'Free Sign ')]")).click();
		driver.close();
		
		

	}

}