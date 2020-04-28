package AutoDropDown_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDown_1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		// wait for 2 seconds for each and every object /action
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		//this will drop the auto suggestive drop down
		Thread.sleep(2000);
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		Thread.sleep(2000);
		
		
		//java Script html dom can identify the Hidden objects as well
		//because selenium cannot identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it have any hidden text
		
		//JavascriptExecutor script
		
		
		
		

	}

}
