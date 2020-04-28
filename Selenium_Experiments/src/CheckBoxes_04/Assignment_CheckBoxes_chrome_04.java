package CheckBoxes_04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_CheckBoxes_chrome_04 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Jars\\\\Selenium jar\\\\Browerdrivers\\\\ChromeDriver\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement checkbox=driver.findElement(By.xpath("//fieldset//descendant::input[@id='checkBoxOption1']"));
		System.out.println(checkbox.isSelected());
		Assert.assertFalse(checkbox.isSelected());
		checkbox.click();//checked
		System.out.println(checkbox.isSelected());
		Assert.assertTrue(checkbox.isSelected());
		checkbox.click();//uncheck
		System.out.println(checkbox.isSelected());
		Assert.assertFalse(checkbox.isSelected());
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		//Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(),"3");
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(),3);
		//or
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		driver.close();
		System.out.println("Test Passed");
		
	}

}
