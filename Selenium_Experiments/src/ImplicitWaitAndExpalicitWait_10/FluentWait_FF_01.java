package ImplicitWaitAndExpalicitWait_10;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_FF_01 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("[id=start]>button")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
		
		
		public WebElement apply(WebDriver driver)
		{
			if(driver.findElement(By.cssSelector("#finish")).isDisplayed())
			{
				return driver.findElement(By.cssSelector("#finish"));
			}
			else
				return null;
		}

		
		});
		
		System.out.println(driver.findElement(By.cssSelector("#finish")).getText());

	}

}
