package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageobjects {
	
	public WebDriver driver;
	
	public LoginPageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.NAME,using="uid")
	WebElement custname;
	
	@FindBy(how=How.NAME,using="password")
	WebElement custpassword;
	
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement custlogin;
	
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	WebElement custlogout;
	
	
	public void setUsername(String uname)
	{
		custname.sendKeys(uname);
	}
	
	public void setpassword(String pwd)
	{
		custpassword.sendKeys(pwd);
	}
	
	public void setLogin()
	{
		custlogin.click();
	}
	
	public void setlogout()
	{
		custlogout.click();
	}
	
	

}
