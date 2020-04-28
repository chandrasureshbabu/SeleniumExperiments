package Locators_02;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Text_Xpath09 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.lambdatest.com/blog/complete-guide-for-using-xpath-in-selenium-with-examples/");
		
		driver.findElementByXPath(("//a[text()='Free Sign Up']")).click();
		driver.close();
		
		

	}

}