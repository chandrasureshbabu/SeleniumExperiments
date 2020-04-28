package SSLOrHttpCertificates_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOPtions2 {

	public static void main(String[] args) {
		
		
		//Desired capabilities
		
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		
		ch.acceptInsecureCerts();
		
		//below to ur local Browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriverLtst\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.ndtv.com/entertainment/sobhita-dhulipala-accused-of-faking-a-self-timed-photoshoot-writes-about-unkind-conclusions-2217994?pfrom=home-lateststories");
		System.out.println("Test passed");
		driver.close();
	}

}
