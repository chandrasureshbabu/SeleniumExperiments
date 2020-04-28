package Ecommerce_09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AddtoCart_FF_02 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//taking elements of productname to the list
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		//iterating through the list using for loop
		for(int i=0; i<products.size();i++)
		{
			//getting products names to the string
			String productname=products.get(i).getText();
			//getting specific product name "Cucumber", 
			if(productname.contains("Cucumber"))
			{
				//Adding "Cucumber", 5 times
				for(int j=0;j<4;j++)
				{
					driver.findElementsByCssSelector("a.increment").get(i).click();
					Thread.sleep(5000);
				}
				//adding items to the cart	
				driver.findElementsByXPath("//button[text()='ADD TO CART']").get(i).click();
				
				Thread.sleep(5000);
				break;
			}
			
			
		}
		driver.close();
		System.out.println("Test passed");

	}

}
