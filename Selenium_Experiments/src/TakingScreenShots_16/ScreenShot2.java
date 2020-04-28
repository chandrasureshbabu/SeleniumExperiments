package TakingScreenShots_16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriverLtst\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		// taking screen 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			//copying file to the local path
			FileUtils.copyFile(src, new File("E:\\Selenium Experiments_Screens\\screenshot2.png"));
			System.out.println("Test passed  -Screen Taken");
		} catch (IOException e) {
			System.out.println("No Screen taken /saved");
			e.printStackTrace();
		}
		driver.close();

	}

}
