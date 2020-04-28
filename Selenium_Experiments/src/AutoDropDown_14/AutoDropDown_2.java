package AutoDropDown_14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoDropDown_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Thread.sleep(2000);
		
		driver.findElement(By.id("src")).sendKeys("hydera");
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		
		String srce=driver.findElement(By.id("src")).getText();
		System.out.println(srce);
		//cannot print /get value from src field , since it was handleled as JS
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script= " return document.getElementById(\"src\").value;";
		// element should be with frwrd slash since it is "", shuold be ended with ;
		String src=(String) js.executeScript(script);
		System.out.println(src);
		driver.close();
		

	}

}
