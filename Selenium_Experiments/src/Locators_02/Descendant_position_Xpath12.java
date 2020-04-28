package Locators_02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Descendant_position_Xpath12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.lambdatest.com/blog/complete-guide-for-using-xpath-in-selenium-with-examples/");
		
		driver.findElementByXPath(("//a[contains(text(),'Free Sign ')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//div[@id='app']//descendant::input[position()=2]")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
		
		

	}

}