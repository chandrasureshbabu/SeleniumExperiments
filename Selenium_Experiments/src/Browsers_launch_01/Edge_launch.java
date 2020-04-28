package Browsers_launch_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_launch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\MicrosoftWebDriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.get("http://way2automation.com");

	}

}
