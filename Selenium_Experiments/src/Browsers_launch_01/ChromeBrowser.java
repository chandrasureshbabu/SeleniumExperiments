package Browsers_launch_01;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://way2automation.com");
		
		driver.close();

	}

}
