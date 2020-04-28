package WebTables_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTables_Handling_05 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22656/rsa-vs-eng-2nd-t20i-england-tour-of-south-africa-2019-20");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(20000);
		//*[@id='innings_1'] //child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]
		////*[@id='innings_1'] //child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]//child::div[@class='cb-col cb-col-100 cb-scrd-itms']
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='innings_1'] //child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][1]")).isDisplayed());
		System.out.println("assert passed");
		String xps="*[@id='innings_1'] //child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][";
		String xpe="]//child::div[contains(@class,'cb-col cb-col-100 cb-scrd')]";
		
		int rowno=0;
		
		for(int i=1;i<11;i++)
		{
			String x=driver.findElement(By.xpath(xps+i+xpe)).getText();
			rowno++;
			System.out.println(x);
		}
		System.out.println(rowno);
		driver.close();
		
		
	} 

}
