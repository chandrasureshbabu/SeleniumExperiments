package Ecommerce_09;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayofItems_AddtoCart_Chrome_04 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		//array items 
		
		String[] items= {"Brocolli","Cucumber"};
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//taking elements of productname to the list
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		//converting array to array list
		
	//List itemsneeded= Arrays.asList(items);
		
	
		//iterating through the list using for loop
		for(int i=0;i<products.size();i++)
		{
			
			//getting products names to the string
			String[] productName=products.get(i).getText().split("-");
			String formattedname=productName[0].trim();
			//System.out.println(productName);
			//getting specific product name "Cucumber", 
			
			List itemsneeded= Arrays.asList(items);
			if(itemsneeded.contains(formattedname))
			{
				
				//if it is found then only we are adding to the list using that respective add to cart button
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementsByXPath("//button[text()='ADD TO CART']").get(i).click();
				Thread.sleep(10000);
				System.out.println(formattedname + "Addded to Cart");
			
				//after that we breaking off fromt he for loop , since we are not looking for any other 
				
				
			}
		}
		
		driver.close();
		System.out.println("Test Passed");
		
		

	}

}
