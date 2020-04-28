package Sorting_Column_values_15_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sortimg_DescngOrder_Check {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriverLtst\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[contains(text(),'Veg/fruit')]").click();
		//driver.findElementByXPath("//span[@class='sort-direction asc']").click();
		//step 1 taking WebElements to the list
		
		List<WebElement> list= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
	
		//creating other array list
		ArrayList<String> originalList= new ArrayList<String>();
		// step2 taking all texts opf the elements to other list i.e original list.
		for(WebElement e:list)
		{
			originalList.add(e.getText());
			
			
			
		}
		//Printing  all Texts of the Original List.
		System.out.println("----------Original List---------------");
		for(String s :originalList)
			
		{
			
			System.out.println(s);
		}
		
		//Step3 copy original List to other List to Sort List ot in Descending
		
		ArrayList<String> copiedList= new ArrayList<String>();
		
		for(int i=0; i<originalList.size();i++)
		{
			copiedList.add(originalList.get(i));
		}
		
		//now sort to ascnding order
		Collections.sort(copiedList);
		System.out.println("----------copiedList after sort---------------");
		for(String s:copiedList)
		{
			System.out.println(s);
		}
		
		//NOw reverse the List  to Descending
		
		Collections.reverse(copiedList);
		System.out.println("----------copiedList---------------");
		for(int j=0;j<copiedList.size();j++)
		{
			System.out.println(copiedList.get(j));
		}
		
		Assert.assertTrue(originalList.equals(copiedList));
		driver.close();
	}

}
