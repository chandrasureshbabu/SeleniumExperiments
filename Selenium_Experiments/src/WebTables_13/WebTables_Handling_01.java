package WebTables_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables_Handling_01 {
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22656/rsa-vs-eng-2nd-t20i-england-tour-of-south-africa-2019-20");
		System.out.println("opened PAGE");
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement table= driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int rows= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	int cols=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	for(int i=0;i<cols-2;i++)
	{
		System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
	}
	
	 System.out.println(driver.findElement(By.xpath("//div[text()='Extras']//following-sibling::div[1]")).getText());
	 
	 System.out.println(driver.findElement(By.xpath("//div[text()='Total']//following-sibling::div[1]")).getText());
		driver.close();
	
	}

}
