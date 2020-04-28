package Locators_02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Following_Xpath13 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.lambdatest.com/blog/complete-guide-for-using-xpath-in-selenium-with-examples/");
		
		driver.findElementByXPath(("//a[contains(text(),'Free Sign ')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//*[@class='googleSignInBtn']//following::div[1]/input")).sendKeys("suresh nemani");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//*[@class='googleSignInBtn']//following::div[2]/input")).sendKeys("chandra.nemani@gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//*[@class='googleSignInBtn']//following::div[4]/input")).sendKeys("password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//*[@class='googleSignInBtn']//following::div[5]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//*[@class='googleSignInBtn']//following::div[5]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//*[@class='googleSignInBtn']//following::div[6]/input")).sendKeys("password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//*[@class='googleSignInBtn']//following::div[7]/input")).sendKeys("1234567890");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath(("//*[@class='googleSignInBtn']//following::div[8]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.close();
		
		

	}

} 