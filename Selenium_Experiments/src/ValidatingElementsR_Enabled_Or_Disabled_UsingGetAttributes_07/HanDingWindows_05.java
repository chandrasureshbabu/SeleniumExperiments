package ValidatingElementsR_Enabled_Or_Disabled_UsingGetAttributes_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HanDingWindows_05 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Multiple Windows')]")));
		
		WebElement e= driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]"));
		e.click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		//Set<String> handles=driver.getWindowHandles();
		//Iterator<String> it=handles.iterator();
		
		ArrayList<String> ids=new ArrayList<String> (driver.getWindowHandles());
		//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(ids.get(0));
		System.out.println(ids.get(1));
		//switching to child tab
		driver.switchTo().window(ids.get(1));
		System.out.println("Child Page Title :"+driver.getTitle());
		//switching to parent tab
		driver.switchTo().window(ids.get(0));
		System.out.println("parent Page Title :"+driver.getTitle());
		
		
		
	}

}
