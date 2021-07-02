package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPageobjects;

public class LoginTest extends BaseClass {
	
	@Test
	public void LoginTestcase() throws InterruptedException, IOException
	{
	
	LoginPageobjects l1=new LoginPageobjects(driver);
	l1.setUsername(Username);
	logger.info("Username entered");
	Thread.sleep(5000);
	l1.setpassword(Password);
	logger.info("Password entered");
	Thread.sleep(5000);
	l1.setLogin();
	logger.info("Login clciked");
	Thread.sleep(5000);
	
	if(driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank####"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		getScreenCapture(driver,"LoginTestcase");
		Assert.assertTrue(false);
	}
	}
	
	
	
	
	

}
