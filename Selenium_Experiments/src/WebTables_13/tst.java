package WebTables_13;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tst {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium Jars\\Selenium jar\\Browerdrivers\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://www.cricbuzz.com/cricket-scorecard-archives/scorecard/10719");
		
		//row data & row count
		String xp_start = "//*[@id='Inngs_1']/div[3]/div[";
		String xp_end = "]/div[1]";
		
		Thread.sleep(3000L);

		int rownum=0;
		/*for(int i=1; i<=11;i=i+1){
			String x = driver.findElement(By.xpath(xp_start + i + xp_end)).getText();
			rownum++;
			System.out.println(x);
		}
		
		System.out.println("Row count is : "+rownum);
		
		String xpcol_start = "//*[@id='Inngs_1']/div[3]/div[1]/div[";
		String xpcol_end = "]";
		
		Thread.sleep(3000L);*/
		
		int colnum=0;
		/*for(int i=1; i<=7;i=i+1){
			String x = driver.findElement(By.xpath(xpcol_start + i + xpcol_end)).getText();
			colnum++;
			System.out.println(x);
		}
		
		System.out.println("Col count is : "+colnum);
		
		//extract data from entire table
*/		
		System.out.println("------------------------");
		
		
		String xpth_start = "//*[@id='innings_1'] ";
		String xpth_mid = "//child::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][";
		String xpth_end = "]";
		
		
		for(int rows=1;rows<=rownum;rows++){
			
			for(int cols=1;cols<=colnum;cols++){
				
				String y = driver.findElement(By.xpath(xpth_start+rows+xpth_mid+cols+xpth_end)).getText();
				System.out.println(y);
				
			}
			
			System.out.println(); // print all the values in the sperate line
			
		}

	}

}
