package restAssuredTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class DJ {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "/home/ranjeet/Downloads/geckodriver/");
		//System.setProperty("webdriver.chrome.driver", "/home/ranjeet/Downloads/chromedriver/");
		
		 driver=new FirefoxDriver();
		//driver=new ChromeDriver();
		driver.get("https://labapi.petbiotech.in/admin/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ev@pet123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("hello");
		System.out.println("hello");
	}
	@Test(enabled=false)
	//@Test
	public void  AddCountrys() throws InterruptedException, IOException
	{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[.='Countrys']")).click();
	driver.findElement(By.xpath("//a[@class='addlink']")).click();
    //Thread.sleep(2000);
   // driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
   // Thread.sleep(2000);
	String CSV_file="/home/ranjeet/Desktop/CSV files/Country.csv";
	Thread.sleep(2000);
	CSVReader reader=new CSVReader(new FileReader(CSV_file));
	String[] cell;
	while((cell=reader.readNext())!=null)
	{   int i;
		for(i=0;i<cell.length-1;i++)
		{
			
			String country=cell[i];
			String code=cell[i+1];
			driver.findElement(By.xpath("//input[@id='id_name']")).sendKeys(country);
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='id_code']")).sendKeys(code);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='_save']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			//Thread.sleep(2000);
			//String str = driver.getCurrentUrl();
			//if(str.equals("https://nwapi.agritechie.com/dashboard/"))
			//{
				//System.out.println("Passed");
				//driver.findElement(By.xpath("//a[@href='/logout/?next=/']")).click();
			//}
			//else
			//{
				//System.out.println("failed");
				//driver.findElement(By.id("id_username")).clear();
			//}
			
		}
		
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//Thread.sleep(2000);
		
	}
	}
	@Test(enabled=false)
	//@Test
	public void  AddStates() throws InterruptedException, IOException
	{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[.='States']")).click();
	driver.findElement(By.xpath("//a[@class='addlink']")).click();
    //Thread.sleep(2000);
   // driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
   // Thread.sleep(2000);
	String CSV_file="/home/ranjeet/Desktop/CSV files/States.csv";
	Thread.sleep(2000);
	CSVReader reader=new CSVReader(new FileReader(CSV_file));
	String[] cell;
	while((cell=reader.readNext())!=null)
	{   int i;
		for(i=0;i<cell.length-1;i++)
		{
			
			String state=cell[i];
			String code=cell[i+1];
			driver.findElement(By.xpath("//input[@id='id_name']")).sendKeys(state);
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='id_state_code']")).sendKeys(code);
			Thread.sleep(2000);
			WebElement ddAddr = driver.findElement(By.xpath("//select[@name='country']"));
			Thread.sleep(1000);
			ddAddr.sendKeys("India");
			driver.findElement(By.xpath("//input[@name='_save']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			//Thread.sleep(2000);
			//String str = driver.getCurrentUrl();
			//if(str.equals("https://nwapi.agritechie.com/dashboard/"))
			//{
				//System.out.println("Passed");
				//driver.findElement(By.xpath("//a[@href='/logout/?next=/']")).click();
			//}
			//else
			//{
				//System.out.println("failed");
				//driver.findElement(By.id("id_username")).clear();
			//}
			
		}
		
		driver.findElement(By.xpath("//a[@class='addlink']")).click();
		Thread.sleep(2000);
		
	}
	
	}
	
	
	@AfterMethod
	public void tearDown()

	{
		
		driver.quit();
		
	
	}	

}
