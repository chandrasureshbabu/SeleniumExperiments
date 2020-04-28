package Techniquestoautomate_AjaxCalls_Child_WindowsAndIFrames_11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HanDingWindows_04 {

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
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String parentid=it.next();
		System.out.println(parentid);
		String childid=it.next();
		System.out.println(childid);
		//switching to child tab
		driver.switchTo().window(childid);
		System.out.println("Child Page Title :"+driver.getTitle());
		//switch back parent tab
		driver.switchTo().window(parentid);
		System.out.println("parent page Title :"+driver.getTitle());
		
	}

}
