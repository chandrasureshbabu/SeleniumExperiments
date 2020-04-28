package ImplicitWaitAndExpalicitWait_10;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_IE_03 {

	public static void main(String[] args) {


		System.setProperty("webdriver.ie.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("[id=start]>button")).click();
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		  .withTimeout(Duration.ofSeconds(30))
		  .pollingEvery(Duration.ofSeconds(5))
		  .ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		  public WebElement apply(WebDriver driver) 
		  {
			  
			  if(driver.findElement(By.cssSelector("#finish")).isDisplayed())
				  return driver.findElement(By.cssSelector("#finish"));
			  else
				  return null;
		  }
		});
		
		System.out.println(driver.findElement(By.cssSelector("#finish")).getText());
		driver.close();
		  
	}

}
