package ImplicitWaitAndExpalicitWait_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Assignment_FF_04 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		WebDriverWait w= new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#results")));
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
		
		driver.close();
		

	}

}
