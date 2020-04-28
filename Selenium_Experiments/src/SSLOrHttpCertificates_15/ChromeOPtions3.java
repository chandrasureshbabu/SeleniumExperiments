package SSLOrHttpCertificates_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOPtions3 {

	public static void main(String[] args) {
		//SSl certificates

		//Desired capabilities=
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belows to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		//.setProperty("webdriver.chrome.driver", "");
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriverLtst\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		//driver.get("https://www.ndtv.com/entertainment/sobhita-dhulipala-accused-of-faking-a-self-timed-photoshoot-writes-about-unkind-conclusions-2217994?pfrom=home-lateststories");
		driver.get("https://www.instagram.com/liliflower33/?hl=en");
		System.out.println("Test Passed");
		driver.close();
	}

}
