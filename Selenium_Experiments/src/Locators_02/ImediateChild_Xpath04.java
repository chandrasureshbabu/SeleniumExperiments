package Locators_02;


import org.openqa.selenium.chrome.ChromeDriver;

public class ImediateChild_Xpath04 {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElementByXPath("//div[@class='FPdoLc tfB0Bf']/center/input[2]").click();
		driver.close();
	}

}
