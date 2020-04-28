package WebTables_13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables_Handling_04 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement table=driver.findElement(By.xpath("//table[@id='product']"));
		
		//limiting scope to the table, getting rows 
		
		int rows=table.findElements(By.xpath("//table[@id='product']//tbody/tr")).size();
		System.out.println("No od rows in the table :"+ rows);
		int cols=table.findElements(By.xpath("//table[@id='product']//tbody/tr[1]/th")).size();
		System.out.println("No od cols in the table :"+ cols);
		
		//reading data from each row
		for(int i=0;i<rows;i++)
		{
			if(i==2) {
			System.out.println(table.findElements(By.xpath("//table[@id='product']//tbody/tr")).get(i).getText()+ "\t");
			break;
			}
			
		}
		driver.close();

	}

}
