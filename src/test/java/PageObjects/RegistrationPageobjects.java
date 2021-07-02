package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageobjects {
	
	public  WebDriver driver;
	
	public RegistrationPageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	 
     @FindBy(how=How.XPATH,using="//body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
     WebElement newcustmor;
     @FindBy(how=How.NAME,using="name")
     WebElement custname;
     @FindBy(how=How.NAME,using="dob")
     WebElement custdob;
     @FindBy(how=How.NAME,using="addr")
     WebElement custaddr;
     @FindBy(how=How.NAME,using="city")
     WebElement custcity;
     @FindBy(how=How.NAME,using="state")
     WebElement custstate;
     @FindBy(how=How.NAME,using="pinno")
     WebElement custpin;
     @FindBy(how=How.NAME,using="telephoneno")
     WebElement custmobileno;
     @FindBy(how=How.NAME,using="emailid")
     WebElement custemail;
     @FindBy(how=How.NAME,using="password")
     WebElement custpwd;
     @FindBy(how=How.NAME,using="sub")
     WebElement custsub;
     
     public void setnewCustmor()
     {
    	 newcustmor.click();
     }
     
     public void setcustName(String custorname)
     {
    	 custname.sendKeys(custorname);
     }
     
     public void setcustdobday(String custday)
     {
    	 custdob.sendKeys(custday);
     }
     
     public void setcustdobmon(String custmon)
     {
    	 custdob.sendKeys(custmon);
     }
     
     public void setcustdobyear(String custyear)
     {
    	 custdob.sendKeys(custyear);
     }
     
     public void setcustaddr(String custoraddr)
     {
    	 custaddr.sendKeys(custoraddr);
     }
     public void setcustcty(String custcty)
     {
    	 custcity.sendKeys(custcty);
     }
     
     public void setcuststate(String custsta)
     {
    	 custstate.sendKeys(custsta);
     }
     
     public void setcustpin(String cstpin)
     {
    	 custpin.sendKeys(cstpin);
     }
     public void setcustmobile(String cstmno)
     {
    	 custmobileno.sendKeys(cstmno);
     }
     public void setcustemail(String custmail)
     {
    	 custemail.sendKeys(custmail);
     }
     
     public void setcustpassword(String cstpwd)
     {
    	 custpwd.sendKeys(cstpwd);
     }
     
     public void setcustsub()
     {
    	 custsub.click();
     }
     
     
     
}
