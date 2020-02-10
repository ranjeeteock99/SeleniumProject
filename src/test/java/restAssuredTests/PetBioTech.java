package restAssuredTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class PetBioTech {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "/home/ranjeet/Downloads/geckodriver/");
		//System.setProperty("webdriver.chrome.driver", "/home/ranjeet/Downloads/chromedriver/");
		
		 driver=new FirefoxDriver();
		//driver=new ChromeDriver();
		driver.get("http://petbiotechweb.agritechie.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("employee_01@example.com");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	@Test(enabled=false)
	//@Test
	public void  AddSpecimen() throws InterruptedException, IOException
	{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//span[.='Masters']")).click();
	driver.findElement(By.xpath("//span[.='Specimen']")).click();
	String CSV_file="/home/ranjeet/Desktop/CSV files/Selenium/SpecimenAddSelenium.csv";
	Thread.sleep(2000);
	CSVReader reader=new CSVReader(new FileReader(CSV_file));
	String[] cell;
	while((cell=reader.readNext())!=null)
	{   
		for(int i=0;i<cell.length-1;i++)
		{
			
			String name=cell[i];
			String des=cell[i+1];
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			driver.findElement(By.xpath("//input[@name='title']")).sendKeys(name);
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='description']")).sendKeys(des);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[.='Save']")).click();
			Thread.sleep(20000);
			
			
		}
		
		
		
	}
	
	}
	@Test(enabled=false)
		//@Test
		public void  AddTest()throws InterruptedException, IOException
		{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//driver.findElement(By.xpath("//span[.='Masters']")).click();
		driver.findElement(By.xpath("/html/body/app-root/basic/div/navigation/nav/div/ul/section/li[9]/a/span")).click();
	
		driver.findElement(By.xpath("//span[.='Test List']")).click();
		String CSV_file="/home/ranjeet/Desktop/CSV files/Selenium/TestAddByselenium.csv";
		Thread.sleep(2000);
		CSVReader reader=new CSVReader(new FileReader(CSV_file));
		String[] cell;
		while((cell=reader.readNext())!=null)
		{   
			for(int i=0;i<cell.length-2;i++)
			{
				
				String testname=cell[i];
				String des=cell[i+1];
				String price=cell[i+2];
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				driver.findElement(By.xpath("//input[@name='test_name']")).sendKeys(testname);
			    Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='test_description']")).sendKeys(des);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='price']")).sendKeys(price);
				Thread.sleep(2000);
				WebElement ddAddr = driver.findElement(By.xpath("//select[@name='species']"));
				Select sel=new Select(ddAddr);
				List<WebElement> alloptions=sel.getOptions();
				alloptions.get(4).click();
				System.out.println(alloptions.get(4));
				//ddAddr.sendKeys("Select Species");
				
				driver.findElement(By.xpath("//button[.='Add']")).click();
				Thread.sleep(2000);
				
			}
			
			
		}
		}
	//@Test
	@Test(enabled=false)
	public void  AddBreed() throws InterruptedException
	{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//span[.='Masters']")).click();
    //Thread.sleep(2000);
    driver.findElement(By.xpath("//span[.='Breed List']")).click();
    //Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
   // Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Indian Donkey2");
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='description']")).sendKeys("Very Labourious2");	
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//button[.='Save']")).click();
	//Thread.sleep(5000);
	}
	//@Test
		@Test(enabled=false)
		public void  PickupRequest() throws InterruptedException
		{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[.='Request Pickup']")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//span[.='Breed List']")).click();
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Thread.sleep(10000);
	    WebElement ddAddr = driver.findElement(By.id("client"));
	    ddAddr.sendKeys("manish");
	    Thread.sleep(2000);
		ddAddr.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		ddAddr.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		Thread.sleep(5000);
		}
	@Test(enabled=false)
	//@Test
	public void  AddEmployee() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//span[.='Employees']")).click();	   
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Your First Name']")).sendKeys("Manuj");
		driver.findElement(By.xpath("//input[@placeholder='Your Last Name']")).sendKeys("Mishra");
		driver.findElement(By.xpath("//input[@placeholder='Your Email']")).sendKeys("ranjeetmihsraa1@mail.com");		
		driver.findElement(By.xpath("//input[@placeholder='Your Mobile Number']")).sendKeys("8130161992");		
		driver.findElement(By.xpath("//input[@placeholder='Your Address']")).sendKeys("Banglore");		
		driver.findElement(By.xpath("//input[@placeholder='Your Location']")).sendKeys("Girinagar");		
		driver.findElement(By.xpath("//input[@placeholder='Your Pincode']")).sendKeys("530068");		
		driver.findElement(By.xpath("/html/body/app-root/basic/div/div/app-add-employee/div[2]/div/form/div[5]/div[2]/div[1]/label/span")).click();		
		WebElement ddAddr = driver.findElement(By.xpath("//select[@name='designation_id']"));
		Select sel=new Select(ddAddr);
		List<WebElement> alloptions=sel.getOptions();	
		alloptions.get(2).click();		
		WebElement ddAddr1 = driver.findElement(By.xpath("//select[@name='roles_id']"));
		Select sel1=new Select(ddAddr1);
		List<WebElement> alloptions1=sel1.getOptions();		
		alloptions1.get(2).click();	
		driver.findElement(By.xpath("//button[.='Save\n" + 
				"          ']")).click();
		
	}
	//@Test(enabled=false)
		@Test
		public void  AddClient() throws InterruptedException, IOException
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//span[.='Vet/Clients']")).click();	   
		    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Your First Name']")).sendKeys("Kaljit");
			driver.findElement(By.xpath("//input[@placeholder='Your Last Name']")).sendKeys("Mishra");
			driver.findElement(By.xpath("//input[@placeholder='Clinic Name']")).sendKeys("KumarBiotech");		
			driver.findElement(By.xpath("//input[@placeholder='  Your Email']")).sendKeys("kaljit@gmail.com");		
			driver.findElement(By.xpath("//input[@placeholder='Building Floor']")).sendKeys("2nd");		
			driver.findElement(By.xpath("//input[@placeholder='  Your Locality']")).sendKeys("Girinagar");
			driver.findElement(By.xpath("//input[@placeholder=' Your Location']")).sendKeys("Girinagar");
			driver.findElement(By.xpath("//input[@placeholder=' Your street']")).sendKeys("Gandhinagr");
			driver.findElement(By.xpath("//input[@placeholder=' Your Area']")).sendKeys("Girinagar");
			driver.findElement(By.xpath("//input[@placeholder=' Your Pincode']")).sendKeys("530068");		
			driver.findElement(By.xpath("/html/body/app-root/basic/div/div/app-add-client/div[2]/div/form/div[7]/div[1]/div[2]/label/span")).click();
			driver.findElement(By.xpath("//input[@placeholder=' Your Mobile Number']")).sendKeys("8130161991");
			
			WebElement ddAddr = driver.findElement(By.xpath("//select[@name='designation_id']"));
			Select sel=new Select(ddAddr);
			List<WebElement> alloptions=sel.getOptions();	
			alloptions.get(2).click();	
			driver.findElement(By.xpath("//input[@placeholder='  Your Qualification']")).sendKeys("MBBS");
			WebElement ddAddr1 = driver.findElement(By.xpath("//select[@name='country_id']"));
			Select sel1=new Select(ddAddr1);
			List<WebElement> alloptions1=sel1.getOptions();		
			alloptions1.get(1).click();	
			WebElement ddAddr2 = driver.findElement(By.xpath("//select[@name='state_id']"));
			Select sel2=new Select(ddAddr2);
			List<WebElement> alloptions2=sel2.getOptions();		
			alloptions2.get(1).click();	
			WebElement ddAddr3 = driver.findElement(By.xpath("//select[@name='city_id']"));
			Select sel3=new Select(ddAddr3);
			List<WebElement> alloptions3=sel3.getOptions();		
			alloptions3.get(1).click();	
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
	
	

	@AfterMethod
	public void tearDown()

	{
		driver.quit();
	
	}																				

}
