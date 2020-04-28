package Sorting_Column_values_15_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sorting_Column_values_Step1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//Step 1 getting 2nd column to the  list
		
		List<WebElement> names= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		for(WebElement name:names)
		{
			System.out.println(name.getText());
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		
		//or
		 for(int  i=0; i<names.size();i++)
		 {
			 System.out.println(names.get(i).getText());
		 }

	}

}
