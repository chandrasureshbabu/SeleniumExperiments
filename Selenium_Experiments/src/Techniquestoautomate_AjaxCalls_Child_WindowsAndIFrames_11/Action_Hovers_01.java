package Techniquestoautomate_AjaxCalls_Child_WindowsAndIFrames_11;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action_Hovers_01 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-link-accountList']/child::span[2]")));
		
		Actions a= new Actions(driver);
		//move to specific element
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']/child::span[2]"))).build().perform();
		driver.close();
		System.out.println("Test Passed");
	}

}
