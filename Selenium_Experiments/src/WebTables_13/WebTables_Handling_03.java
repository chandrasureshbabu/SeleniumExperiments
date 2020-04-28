package WebTables_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebTables_Handling_03 {
	
	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22656/rsa-vs-eng-2nd-t20i-england-tour-of-south-africa-2019-20");
		System.out.println("opened PAGE");
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//taking the table to the webelement
	WebElement table= driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	
	//limiting scope to the web table , then find rows common element
	int rows= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	//limiting scope to the web table , then find specific cols common element
	int cols=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	//iterating through the rows
	int ttlruns=0;
	for(int i=0;i<cols-2;i++)
	{
		String values=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int ttl=Integer.parseInt(values);
		ttlruns=ttlruns+ttl;
		System.out.println(ttlruns);
	}
	//getting extras
	int ExtraRuns=Integer.parseInt(driver.findElement(By.xpath("//div[text()='Extras']//following-sibling::div[1]")).getText());
	int TotalRuns=ttlruns+ExtraRuns;
	System.out.println("TotalRuns :"+TotalRuns);
	//getting total, comparing with summed values
	
	int Actualruns=Integer.parseInt(driver.findElement(By.xpath("//div[text()='Total']//following-sibling::div[1]")).getText());
	if(Actualruns==TotalRuns)
	{
		System.out.println("test Passed");
	}else
	{
		System.out.println("Test Failed");
	}
	
	// System.out.println(driver.findElement(By.xpath("//div[text()='Total']//following-sibling::div[1]")).getText());
		driver.close();
	
	}

}
