package DropDowns_03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDowns_02 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:5001");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//div[@class='bz_common_actions']//descendant::span[text()='File a Bug']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByCssSelector("#Bugzilla_login").sendKeys("chandra.nemani@gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByCssSelector("input[id='Bugzilla_password']").sendKeys("pass@word1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByCssSelector("form[name*='ogin']>input[type='submit']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select s= new Select(driver.findElementByCssSelector(".field_value >select#bug_severity"));
		
		s.selectByIndex(0);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		s.selectByValue("critical");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		s.selectByVisibleText("enhancement");
		driver.close();
		System.out.println("Test Passed");

	}

}
