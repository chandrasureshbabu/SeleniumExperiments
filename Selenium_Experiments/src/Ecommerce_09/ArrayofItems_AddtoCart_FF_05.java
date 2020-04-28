package Ecommerce_09;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayofItems_AddtoCart_FF_05 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		// Needed items to addto cart
		String[] NeededItems= {"Brocolli","Cucumber"};
		
		//getting product names from the site to the list 
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		//iterating through the products to find NeededItems
		//this is skip loop iteration when needed items are added 
		
		int j=0;
		
		for(int i=0;i<products.size();i++)
		{
			//as product names are having -,spaces we need to take them in to string array, split them on bases of -,
			// trim spaces 
			
			String[] productNames=products.get(i).getText().split("-");
			//taking them in to string , trimming spaces
			
			String formattedNames=productNames[0].trim();
			
			//now looking for NeededItems in FormattedNames of Product's in the site
			
			//before that converting array to List
			
			List itemsNeeded=Arrays.asList(NeededItems);
			//now looking for NeededItems in FormattedNames of Product's in the site
			if(itemsNeeded.contains(formattedNames))
			{
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				for(int c=0;c<4;c++)
				{
					driver.findElementsByCssSelector("a.increment").get(i).click();
					Thread.sleep(5000);
				}
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//adding items to the cart	
				driver.findElementsByXPath("//div[@class='product-action']/button").get(i).click();
				//we can take button Text in xPaths but , but some times after clicked on on button 
				//driver.findElementsByXPath("//button[text()='ADD TO CART']").get(i).click();
				//Thread.sleep(10000);
				// button text changes , then we need to pause the script to for button to come to original text as 
				//we are depending on indexing in list iteration , so that may slips one index, and will that click wrong item
				System.out.println("Items added in the are :"+formattedNames);
				
				if(j==NeededItems.length)
					break;
			}
			
		}
		driver.close();
		
		System.out.println("Test passed");
		
		
		

	}

}
