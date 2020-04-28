package Locators_02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FollowingSibling_Xpath14 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		
	
		driver.findElementByXPath(("//ul[@class='navbar-nav']//li//following-sibling::Li[1]")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//ul[@class='navbar-nav']//li//following-sibling::Li[2]")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//ul[@class='navbar-nav']//li//following-sibling::Li[3]")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//ul[@class='navbar-nav']//li//following-sibling::Li[4]")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//ul[@class='navbar-nav']//li//following-sibling::Li[5]")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//ul[@class='navbar-nav']//li//following-sibling::Li[6]")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//ul[@class='navbar-nav']//li//following-sibling::Li[7]")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.close();
		
		

	}

} 