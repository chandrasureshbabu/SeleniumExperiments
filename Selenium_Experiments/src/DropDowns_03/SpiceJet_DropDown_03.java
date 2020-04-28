package DropDowns_03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet_DropDown_03 {

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.ie.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Select s= new Select(driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_Adult']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		s.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Select s1= new Select(driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_Child']"));
		s1.selectByValue("2");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select s2= new Select(driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_Infant']"));
		s2.selectByVisibleText("3");
		Thread.sleep(2000);
		//verify Values of the Field By getting back the Text of the field
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
		
		
		System.out.println("Test Passed");

	}

}
