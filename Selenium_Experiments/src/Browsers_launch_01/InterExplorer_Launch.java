package Browsers_launch_01;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InterExplorer_Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		driver.findElementByXPath("//div[@class='FPdoLc tfB0Bf']//input[@class='RNmpXc']").click();
		//below is descedant xpath is correct but not working dont y
		//driver.findElementByXPath("//form[@class='tsf nj']//descendant-or-self::div[2]//descendant-or-self::input[3]").click();
		driver.close();
		

	}

}
