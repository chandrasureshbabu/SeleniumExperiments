package ValidatingElementsR_Enabled_Or_Disabled_UsingGetAttributes_07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelectingCurrentDate_chrome_01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//selecting source city
		WebElement source= driver.findElement(By.xpath("//a[contains(text(),' Hyderabad (HYD)')]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		source.click();
		
		//selecting destination city
		
		WebElement destination=driver.findElementByXPath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),' Delhi (DEL)')]");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		destination.click();
		

		//selecting current date
		WebElement Currentday=driver.findElementByCssSelector(".ui-state-default.ui-state-highlight.ui-state-active");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Currentday.click();
		System.out.println("Current Day Selected");
		
		
		//check boxes selection
		
				WebElement checkbox=driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
				System.out.println(checkbox.isSelected());
				//Assertion
				Assert.assertFalse(checkbox.isSelected());
				checkbox.click();
				System.out.println(checkbox.isSelected());
				//Assertion
				Assert.assertTrue(checkbox.isSelected());
				
				
				Thread.sleep(2000);
		
						
				
				
				
	 //Selecting Round Trip radio button
				Thread.sleep(2000);
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")+ "before round trip selection");
				WebElement roundtrip=driver.findElementByXPath("//label[contains(text(),'Round Trip')]");
				
				roundtrip.click();
				//Assert.assertTrue(roundtrip.isSelected());
				Thread.sleep(1000);
				System.out.println(roundtrip.isSelected() + " roundtrip is selected");
				
				Thread.sleep(2000);		
		
		//checking the date/return date calendar field is enabled or 
		//some how verification is failing with isenabled method
			/*WebElement returndate=driver.findElement(By.name("ctl00$mainContent$view_date2"));
			System.out.println(returndate.isEnabled());*/
		// so we will be checking with getattributes related parent tag with some attributes values are changed with 
		//with related action, here wiht click on round trip , opcity values changes 0.5 to 1
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")+ "after round trip selection");
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("return date is  enabled");
				Assert.assertTrue(true);
			}
			else
			{
				System.out.println("return date is  disabled");
				Assert.assertTrue(false);
			}
			

			
		
		driver.close();
		System.out.println("Test Passed");
		
		
		

	}

}
