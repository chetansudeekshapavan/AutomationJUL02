package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import TestUtils.Read_Config;

public class BaseClass {
	
	Read_Config rc=new Read_Config();
	
	public static  WebDriver driver;
	
	public  String BaseUrl=rc.getURL();
	public  String Username=rc.getUsername();
	public  String Password=rc.getPassword();
	
	public static Logger logger;
	
	
	@BeforeClass
	public  void setUp() throws InterruptedException
	{
		logger=Logger.getLogger("Enetbanking");
		PropertyConfigurator.configure("log4j.properties");
        System.setProperty("webdriver.chrome.driver",rc.getChropath());
		driver=new ChromeDriver();
		driver.get(BaseUrl);
		logger.info("url entered");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void Teardown()
	{
		driver.quit();
	}
	
	public void getScreenCapture(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tar=new File(System.getProperty("user.dir")+ "/ScreenShots/" + tname + ".png");
		FileUtils.copyFile(src, tar);
	}
	
	public static String setRandom()
	{
		String emailran=RandomStringUtils.randomAlphanumeric(8);
		return emailran;
	}
	
	public boolean isAlertpresent()
	{
		try
		{
		driver.switchTo().alert().accept();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}

}
