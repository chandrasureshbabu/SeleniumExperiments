package Sorting_Column_values_15_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

public class Sorting_Column_values_Step1ANDStep2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\IE Driver\\IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		

		
		List<WebElement> names=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		

		//Step 1 getting 2nd column to the  list
		ArrayList<String> originallist=new ArrayList<String>();
		System.out.println("-----------------originallist------------------");
		for(WebElement name:names)
		{
			//step2 taking   Webelements text to the an another list
			originallist.add(name.getText());
			
			System.out.println(name.getText());
		}
		
		
		//or we can add values likwe below
		
	/*	for(int i=0;i<names.size();i++)
		{
			originallist.add(names.get(i).getText());
		}
*/
		
		//copying originallist values to other
		
		// for that we are creating other list
		
		ArrayList<String> copiedlist= new ArrayList<String>();
		
		
		for(int j=0;j<originallist.size();j++)
		{
			//step3 copying original list values to other list sort
			copiedlist.add(originallist.get(j));
			
			
		}
		//step 4 now we need to sort this copied list
		
		Collections.sort(copiedlist);
		// now list is sorted
		System.out.println("-----------------Sorted List------------------");
		for(String s:copiedlist)
		{
			
			System.out.println(s);
		}
		
		//now we will compare both original = copied list(sorted list) is true, then it a pass or not sorted
		
		Assert.assertTrue(originallist.equals(copiedlist));
		
		driver.close();

	}

}
