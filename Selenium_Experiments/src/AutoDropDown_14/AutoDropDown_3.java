package AutoDropDown_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoDropDown_3 {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.ie.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.findElement(By.id("src")).sendKeys("hyd");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"src\").value;";
		String srce=(String) js.executeScript(script);
		int i=0;
		
		while(!srce.equalsIgnoreCase("Miyapur, Hyderabad"))
		{
			i++;
			driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
			
			String txt=(String) js.executeScript(script);
			
			
			//print every option displayed in the auto drop 
			System.out.println(txt);
			
			
			if(i>19)
			{
				break;
			}
			
		}
		driver.close();

	}

}
