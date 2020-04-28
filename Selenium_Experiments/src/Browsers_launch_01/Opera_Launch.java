package Browsers_launch_01;

import org.openqa.selenium.opera.OperaDriver;

public class Opera_Launch {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.opera.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\Opera driver\\Operadriver.exe");
	OperaDriver driver= new OperaDriver();
	driver.get("http://way2automation.com");

	}

}
