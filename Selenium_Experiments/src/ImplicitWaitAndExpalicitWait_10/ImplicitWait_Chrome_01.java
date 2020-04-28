package ImplicitWaitAndExpalicitWait_10;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ImplicitWait_Chrome_01 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		String[] items= {"Brocolli","Cucumber"};
		//implicitlyWait is global for every is will wait for 5 sec , if appears below 5 sec it move to next
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addItems(driver, items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//we areusing Text() in below xpath as it is static one
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoWrapper>button")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='promoInfo']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.close();
		
		

	}
	
	public static void addItems(WebDriver driver,String[] items) {
		
		int j=0;
		
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] productNames=products.get(i).getText().split("-");
			String formattedName=productNames[0].trim();
			
			List cartItems=Arrays.asList(items);
			
			if(cartItems.contains(formattedName))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println("Added Items : "+formattedName);
			}
			
			
		}
		
	}

}
