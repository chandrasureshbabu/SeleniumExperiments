package DropDowns_03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoSuggestiveDropDown_14 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElementByXPath("//span[contains(text(),'From')]").click();
		
		WebElement source= driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.clear();
		Thread.sleep(10000);
		source.sendKeys("mum");
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		driver.findElementByXPath("//span[contains(text(),'To')]").click();
		WebElement destination= driver.findElement(By.xpath("//input[@placeholder='To']"));
		
		destination.clear();
		Thread.sleep(10000);
		destination.sendKeys("del");
		int i=0;
		while(i<4)
		{
		destination.sendKeys(Keys.ARROW_DOWN);
		i++;
		}
		
		destination.sendKeys(Keys.ENTER);
		driver.close();
		System.out.println("Test Passed");

	}

}
