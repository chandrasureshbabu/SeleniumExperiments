package RealTimeExercises_12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Calendar_UI_05 {

	public static void main(String[] args) {
		

		

System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");

FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait wait= new WebDriverWait(driver, 1);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#travel_date")));
		//Assert.assertTrue(driver.findElement(By.cssSelector("#travel_date")).isEnabled());
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		//Common element of month
		//if specified vbalue is not equals to true then goes to loop
		
		//String mnoth=driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		System.out.println(driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText());
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/descendant::th[2]")).getText().contains("May"))
		{
			System.out.println("Enter WHile Loop");
			driver.findElement(By.xpath("//div[@class='datepicker-days']/descendant::th[3]")).click();
		}
		
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='datepicker-days']//td"));
		
		for(int i=0;i<dates.size();i++)
		{
			String Date=driver.findElementsByXPath("//div[@class='datepicker-days']//td").get(i).getText();
			
			if(Date.equalsIgnoreCase("23"))
			{
				driver.findElementsByXPath("//div[@class='datepicker-days']//td").get(i).click();
				break;
			}
		}
		
		
		
		

	}

}
