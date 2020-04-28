package RealTimeExercises_12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLInksInNewTab_SwitchingToTabs_03 {
	
	public static void main(String[] args) throws InterruptedException {
	
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
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			
			//Keyboard Action to open links in new tab
			String ClickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			//open link in new tab
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);
			Thread.sleep(5000);
			
		}
		
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		

		
		
	}

}
