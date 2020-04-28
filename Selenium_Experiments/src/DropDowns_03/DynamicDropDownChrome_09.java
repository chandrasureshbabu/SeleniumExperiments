package DropDowns_03;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicDropDownChrome_09 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@value='BLR']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@value='MAA'])[2]").click();
		
		
		//driver.findElementByXPath("(//a[@value='MAA'])[2]").click();
		/*Thread.sleep(10000);// below line is not giving return value  need to see later
		System.out.println(driver.findElementByXPath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']").getText());*/
		driver.close();
		System.out.println("Test Passed");
		

	}

}
