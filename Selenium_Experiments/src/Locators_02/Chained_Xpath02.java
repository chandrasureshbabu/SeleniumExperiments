package Locators_02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chained_Xpath02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElementByXPath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnI']").click();
		driver.close();
	}

}
