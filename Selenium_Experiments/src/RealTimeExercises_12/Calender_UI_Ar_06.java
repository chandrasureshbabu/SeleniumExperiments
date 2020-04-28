package RealTimeExercises_12;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender_UI_Ar_06 {
	
	static int targetday=0;
	static int targetmonth=0;
	static int targetyear=0;
	
	
	static int currentday=0;
	static int currentmonth=0;
	static int currentyear=0;
	
	static int JumpingMonthsBy=0;
	
	static boolean increment=true;

	public static void main(String[] args) {
		
		
		String dateToset= "23/05/2020";
		//get currentdate
		
		getCurrentDateMonthYear();
		System.out.println(currentday+" "+currentmonth+" "+currentyear);
		
		
		//set target date
		getTargetDateMonthAndYear(dateToset);
		
		System.out.println(targetday+" "+targetmonth+" "+targetyear);
		
		//get jump month
		CalculateHowmManyMonthsToJump();
		System.out.println(JumpingMonthsBy);
		System.out.println(increment);
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\geckodriverv0260\\geckodriver.exe");

		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		for(int i=0; i<JumpingMonthsBy;i++)
		{
			if(increment)
			{
			driver.findElement(By.xpath("//div[@class='datepicker-days']/descendant::th[3]")).click();
			
			}
		}	
			
			List<WebElement> dates=driver.findElements(By.xpath("//div[@class='datepicker-days']//td"));
			for(int j=0;j<dates.size();j++)
			{
				String date=driver.findElementsByXPath("//div[@class='datepicker-days']//td").get(j).getText();
				
				if(date.equalsIgnoreCase("23"))
				{
					driver.findElementsByXPath("//div[@class='datepicker-days']//td").get(j).click();
					break;
				}
			
			}
			
		
		
		
		

	}
	
	public static void getCurrentDateMonthYear()
	{
		
		Calendar cal=Calendar.getInstance();
		
		currentday=cal.get(Calendar.DAY_OF_MONTH);
		currentmonth=cal.get(Calendar.MONTH)+1;
		currentyear=cal.get(Calendar.YEAR);
	}
	
	public static void getTargetDateMonthAndYear(String dateString)
	{
		int firstindex=dateString.indexOf("/");
		int lastindex=dateString.lastIndexOf("/");
		
		String day=dateString.substring(0,firstindex);
		targetday=Integer.parseInt(day);
		
		String month=dateString.substring(firstindex+1,lastindex);
		targetmonth=Integer.parseInt(month);
				
		String year= dateString.substring(lastindex+1,dateString.length());
		targetyear=Integer.parseInt(year);
	}

	
	public static void CalculateHowmManyMonthsToJump()
	{
		if((targetmonth-currentmonth)>0)
		{
			JumpingMonthsBy=(targetmonth-currentmonth);
		}else
		{
			JumpingMonthsBy=(currentmonth-targetmonth);
			increment=false;
		}
	}
}
