package SSLOrHttpCertificates_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOPtions1 {

	public static void main(String[] args) {
		
		
		//Ssl Certificates
		//desired capabilities
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriverLtst\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.youtube.com/");
		System.out.println("Passed");
		driver.close();

	}

}
