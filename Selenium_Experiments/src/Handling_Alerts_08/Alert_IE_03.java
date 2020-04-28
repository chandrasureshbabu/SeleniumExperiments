package Handling_Alerts_08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Alert_IE_03 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.ie.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("name")).sendKeys("SDet");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.close();
		System.out.println("Test Passed");

	}

}
