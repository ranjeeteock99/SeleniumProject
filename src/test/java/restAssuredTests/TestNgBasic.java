package restAssuredTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasic {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "/home/ranjeet/Downloads/geckodriver/");
		//System.setProperty("webdriver.chrome.driver", "/home/ranjeet/Downloads/chromedriver/");
		 driver=new FirefoxDriver();
		//driver=new ChromeDriver();
		driver.get("https://officeweb.projectpresent.biz/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	@Test
	//@Test(enabled=false)
	public void TwitterAdhocTestWithMedia() throws InterruptedException
	{
		
		System.out.println("TwitterAdhocTestWithMedia");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("publisher1@projectpresent.biz");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[.='Social share']")).click();
		driver.findElement(By.xpath("//a[.=' Twitter']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(" RNNationall track cyclist  Azizulhasni");
		Thread.sleep(1000);
		WebElement ddAddr = driver.findElement(By.xpath("//select[@name='brand']"));
		Thread.sleep(1000);
		ddAddr.sendKeys("BERNAMA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Click here to upload media']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='https://apioffice.projectpresent.biz//proxy_media/final/Screenshot_2019-10-01-16-42-02-39.png.jpg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Publish ']")).click();
		Thread.sleep(20000);
		String actual = driver.getCurrentUrl();
		Thread.sleep(1000);
		String expected = "https://officeweb.projectpresent.biz/admin/social/twitterList";
		AssertJUnit.assertEquals(actual, expected);
		
	}
	@Test
	//@Test(enabled=false)
	public void TwitterAdhocTestWithoutMedia() throws InterruptedException
	{
		System.out.println("TwitterAdhocTestWithoutMedia");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("publisher1@projectpresent.biz");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[.='Social share']")).click();
		driver.findElement(By.xpath("//a[.=' Twitter']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(" ANRanjeet track cyclist  Azizulhasni bags silver in men’s elite keirin at 2020 Asian ");
		Thread.sleep(1000);
		WebElement ddAddr = driver.findElement(By.xpath("//select[@name='brand']"));
		Thread.sleep(1000);
		ddAddr.sendKeys("BERNAMA");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Publish ']")).click();
		Thread.sleep(20000);
		String actual = driver.getCurrentUrl();
		Thread.sleep(3000);
		String expected = "https://officeweb.projectpresent.biz/admin/social/twitterList";
		AssertJUnit.assertEquals(actual, expected);
		
	}
	//@Test(enabled=false)
	@Test
	public void fbAdhocTestWithOutMedia() throws InterruptedException
	{ 
	System.out.println("fbAdhocTestWithoutMedia");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("publisher1@projectpresent.biz");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//span[.='Social share']")).click();
	driver.findElement(By.xpath("//a[.=' Facebook']")).click();
	driver.findElement(By.xpath("//button[.=' Facebook Publish ']")).click();

	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(" nNAzizulhasni bagshu nksilver in men’s elite keirin at 2020 Asian ");
	Thread.sleep(1000);
	WebElement ddAddr = driver.findElement(By.xpath("//select[@name='brand']"));
	Thread.sleep(1000);
	ddAddr.sendKeys("BERNAMA");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='Publish ']")).click();
	Thread.sleep(20000);
	String actual = driver.getCurrentUrl();
	Thread.sleep(3000);
	String expected = "https://officeweb.projectpresent.biz/admin/social/facebookList";
	AssertJUnit.assertEquals(actual, expected);
    }
	@Test
	//@Test(enabled=false)
	public void fbAdhocTestwithMedia() throws InterruptedException
	{ 
	System.out.println("fbAdhocTestWithMedia");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("publisher1@projectpresent.biz");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//span[.='Social share']")).click();
	driver.findElement(By.xpath("//a[.=' Facebook']")).click();
	driver.findElement(By.xpath("//button[.=' Facebook Publish ']")).click();

	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(" jNNationalko hkktrack cyclist  Azizulhasni bags silver in men’s elite keirin at 2020 Asian ");
	Thread.sleep(1000);
	WebElement ddAddr = driver.findElement(By.xpath("//select[@name='brand']"));
	Thread.sleep(1000);
	ddAddr.sendKeys("BERNAMA");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@alt='Click here to upload media']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//img[@src='https://apioffice.projectpresent.biz//proxy_media/final/Screenshot_2019-10-01-16-42-02-39.png.jpg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='Publish ']")).click();
	Thread.sleep(20000);
	String actual = driver.getCurrentUrl();
	Thread.sleep(3000);
	String expected = "https://officeweb.projectpresent.biz/admin/social/facebookList";
	AssertJUnit.assertEquals(actual, expected);
    }
	@Test
	//@Test(enabled=false)
	public void TagTest() throws InterruptedException
	{ 
	System.out.println("TagTest");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("publisher1@projectpresent.biz");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//span[.='Tags']")).click();
	driver.findElement(By.xpath("//a[.='Add Tags']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ENLIFAAAA");
	WebElement ddAddr = driver.findElement(By.xpath("//select[@name='language_id']"));
	Thread.sleep(1000);
	ddAddr.sendKeys("English ");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[.='Submit ']")).click();
	Thread.sleep(20000);
	String actual = driver.getCurrentUrl();
	Thread.sleep(3000);
	String expected = "https://officeweb.projectpresent.biz/admin/tags/list";
	AssertJUnit.assertEquals(actual, expected);
	}

	@AfterMethod
	public void tearDown()

	{
		driver.quit();
	
	}
}
