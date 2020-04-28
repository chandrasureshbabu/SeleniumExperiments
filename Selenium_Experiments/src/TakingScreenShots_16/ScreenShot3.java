package TakingScreenShots_16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ScreenShot3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",  "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/");
		
		//taking screen
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("E:\\Selenium Experiments_Screens\\screenshot2.png"));
			System.out.println("Screen taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
