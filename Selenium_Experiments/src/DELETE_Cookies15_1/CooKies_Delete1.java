package DELETE_Cookies15_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CooKies_Delete1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",  "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Deleted Cookie");
		driver.get("https://www.youtube.com/");
		//driver.manage().deleteCookieNamed("pinterest");
	
		driver.close();
		
		


	}

}
