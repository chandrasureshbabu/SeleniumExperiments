package WebTables_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables_Handling_06 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22656/rsa-vs-eng-2nd-t20i-england-tour-of-south-africa-2019-20");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	int rows=driver.findElements(By.xpath("//*[@id='innings_1'] //child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//child::div[contains(@class,'cb-col cb-col-100 cb-scrd')]")).size();
	int cols=driver.findElements(By.xpath("//*[@id='innings_1'] //child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//child::div[contains(@class,'cb-col cb-col')]")).size();	
		for(int i=0;i<rows;i++)
		{
			/*String values=driver.findElements(By.xpath("//*[@id='innings_1'] //child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//child::div[contains(@class,'cb-col cb-col-100 cb-scrd')]")).get(i).getText();
			System.out.println(values+"\t");*/
			
			for(int j=0; j<cols;j++)
			{
			
			
			System.out.println(driver.findElements(By.xpath("//*[@id='innings_1'] //child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//child::div[contains(@class,'cb-col cb-col')]")).get(i).getText()+ " \t");
			}
			System.out.println();
			
		}
		
		
		
		driver.close();

	}

}
