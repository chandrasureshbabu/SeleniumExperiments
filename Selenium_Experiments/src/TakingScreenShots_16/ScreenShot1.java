package TakingScreenShots_16;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriverLtst\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.hindustantimes.com/");
		driver.manage().window().maximize();
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("E:\\Selenium Experiments_Screens\\screenshot1.png"));
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		driver.close();

	}

}
