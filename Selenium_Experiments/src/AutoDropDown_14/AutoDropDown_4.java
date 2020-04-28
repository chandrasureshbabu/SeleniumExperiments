package AutoDropDown_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoDropDown_4 {

	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver",  "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
	InternetExplorerDriver driver = new InternetExplorerDriver();
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	driver.findElement(By.id("src")).sendKeys("hyd");
	
	//javascript executor 
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String script = "return document.getElementById(\"src\").value;";
	String src=(String) js.executeScript(script);
	
	int i=0;
	
	while(!src.equalsIgnoreCase("Miyapur, Hyderabad"))
	{
		i++;
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		String txt=(String) js.executeScript(script);
		
		if(txt.equalsIgnoreCase("Miyapur, Hyderabad"))
		{
			
			System.out.println(txt);
			//print every option displayed in the auto drop
			driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
			System.out.println("miyapur selected");
			break;
		}
		
		
		
		 
	}
	driver.close();
	
	
	}

}
