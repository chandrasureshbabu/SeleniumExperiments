package Techniquestoautomate_AjaxCalls_Child_WindowsAndIFrames_11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action_CapitalLetters_doubleclick_RightClick_02 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver, 5);
		Actions a= new Actions(driver);
		WebElement move= driver.findElement(By.xpath("//a[@id='nav-link-accountList']/child::span[2]"));
		//entering capital letters
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-search']//descendant::input[position()=2]"))).click().keyDown(Keys.SHIFT).sendKeys("only jeans").build().perform();
		// right click
		a.moveToElement(move).contextClick().build().perform();
	}

}
