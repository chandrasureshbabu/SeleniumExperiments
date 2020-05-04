package Grid_Process_15;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_Chrome1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// Desired capabilities 
		
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.1.29:4444/wd/hub"),dc);
		driver.get("https://www.youtube.com/watch?v=FM0poaPNAbc&t=1s");
		Thread.sleep(5000);
		driver.close();
		System.out.println("Test passed");
		
		

	}

}
	