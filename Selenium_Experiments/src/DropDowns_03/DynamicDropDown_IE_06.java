package DropDowns_03;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DynamicDropDown_IE_06 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@value='BLR']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("(//a[@value='MAA'])[2]").click();
		/*Thread.sleep(10000);// below line is not giving return value  need to see later
		System.out.println(driver.findElementByXPath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']").getText());*/
		driver.close();
		System.out.println("Test Passed");
		

	}

}
