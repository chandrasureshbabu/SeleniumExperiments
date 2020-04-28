package DropDowns_03;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Parent_Child_DynamicDropDownChrome_11 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		//driver.findElementByXPath("//a[@value='BLR']").click();
		driver.findElementByXPath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']").click();
		Thread.sleep(6000);
		
		
		
		driver.findElementByXPath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']").click();
		/*Thread.sleep(10000);// below line is not giving return value  need to see later
		System.out.println(driver.findElementByXPath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']").getText());*/
		driver.close();
		System.out.println("Test Passed");
		

	}

}
