package ValidatingElementsR_Enabled_Or_Disabled_UsingGetAttributes_07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HanDingWindows_03 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='opentab']")));
		
		//driver.findElement(By.xpath("//div[@class='VfPpkd-Jh9lGc']/following-sibling::a")).sendKeys(Keys.CONTROL+"t");
		
		WebElement e= driver.findElement(By.xpath("//a[@id='opentab']"));
		Actions a=new Actions(driver);
		
		a.moveToElement(e).click().build().perform();
		Set<String> handlesids=driver.getWindowHandles();
		Iterator<String> id=handlesids.iterator();
		
		//parent handle
		String parentid=id.next();
		System.out.println("parent page title :"+driver.getTitle());
		System.out.println(parentid);
		String childId=id.next();
		System.out.println(childId);
		//switching tab
		driver.switchTo().window(childId);
		System.out.println("After witching :"+driver.getTitle());
		
		//switch back to parent
		
		driver.switchTo().window(parentid);
		System.out.println("After Switching back to :"+driver.getTitle());
		driver.close();
		
	
		
		
		

	}

}
