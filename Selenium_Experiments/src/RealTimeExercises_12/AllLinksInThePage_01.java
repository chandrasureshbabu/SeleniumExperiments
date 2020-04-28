package RealTimeExercises_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksInThePage_01 {
	
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// all Links in the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Links only on footer section by limiting scope to footer
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		//links of footersection 1st column only
		
		//to do that we need to limit scope again
		
		WebElement columndriver= footerdriver.findElement(By.xpath("//div[@id='gf-BIG']//child::td[position()=1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		driver.close();
		System.out.println("Test Passed");

		
		
	}

}
