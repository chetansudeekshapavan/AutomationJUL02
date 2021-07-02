package TestCases;

import org.testng.annotations.Test;

import PageObjects.LoginPageobjects;
import PageObjects.RegistrationPageobjects;



public class RegistrationTest extends BaseClass {
	
	
	
	@Test
	public void RegistrationTestcase() throws InterruptedException
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
		
		RegistrationPageobjects rp=new RegistrationPageobjects(driver);
		rp.setnewCustmor();
		Thread.sleep(3000);
		rp.setcustName("pavantest");
		Thread.sleep(3000);
		rp.setcustdobday("24");
		Thread.sleep(3000);
		rp.setcustdobmon("08");
		Thread.sleep(3000);
		rp.setcustdobyear("1986");
		Thread.sleep(3000);
		rp.setcustaddr("Kondapur");
		Thread.sleep(3000);
		rp.setcustcty("chandanagar");
		Thread.sleep(3000);
		rp.setcuststate("Telengana");
		Thread.sleep(3000);
		rp.setcustpin("522647");
		Thread.sleep(3000);
		rp.setcustmobile("9177506216");
		Thread.sleep(3000);
		rp.setcustemail(setRandom()+"@gmail.com");
		Thread.sleep(3000);
		rp.setcustpassword("kumar123");
		Thread.sleep(3000);
		rp.setcustsub();
		Thread.sleep(3000);
	}

}
