package WebCalendars_06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingCurrentDate_chrome_01 {

	public static void main(String[] args) {
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
		
		driver.close();
		
		System.out.println("Test passed");
		
		
		

	}

}
