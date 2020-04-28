package Locators_02;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_Xpath03 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElementByXPath("//div[@class='FPdoLc tfB0Bf']//child::input[2]").click();
		driver.close();
	}

}
