package Browsers_launch_01;


import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox_launch_01 {

	public static void main(String[] args)   {
	
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://way2automation.com");
		driver.close();

	}

}
