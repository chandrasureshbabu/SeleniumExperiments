package CheckBoxes_04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxes_FF_01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://www.spicejet.com/default.aspx");
		
		driver.manage().window().maximize();
		
		//check boxes
		
		WebElement checkbox=driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
		//counting no of checkBoxes
		
		List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(checkboxes.size());
		
		//selecting adults,child,infants
		
		driver.findElement(By.id("divpaxinfo")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//adults
		
		WebElement adults=driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_Adult']");
		Select adult= new Select(adults);
		adult.selectByIndex(2);
		
		Thread.sleep(2000);
		
		//Childs
		
		WebElement childs=driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_Child']");
		Select child=new Select(childs);
		child.selectByValue("3");
		
		Thread.sleep(2000);
		
		//infants
		WebElement infants=driver.findElementByXPath("//*[@id='ctl00_mainContent_ddl_Infant']");
		Select infant=new Select(infants);
		infant.selectByValue("1");
		
		driver.close();
		System.out.println("Test passed");
		

	}

}
