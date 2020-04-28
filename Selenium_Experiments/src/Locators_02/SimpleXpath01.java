package Locators_02;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleXpath01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("susreshnemani");
		driver.findElementByXPath("//input[@type='password']").sendKeys("susreshnemani");
		driver.findElementByXPath("//input[@type='submit']").click();
		

	}

}
