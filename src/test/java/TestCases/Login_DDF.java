package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPageobjects;
import TestUtils.XLUtils;

public class Login_DDF extends BaseClass {
	
	
	@Test(dataProvider="LoginTest")
	public void LoginDDF(String sai,String sudeeksha)
	{
		LoginPageobjects lp=new LoginPageobjects(driver);
		lp.setUsername(sai);
		lp.setpassword(sudeeksha);
		lp.setLogin();
		
		if(isAlertpresent()==true)
		{
			driver.switchTo().alert().accept();
			Assert.assertTrue(false);
		}
		else
		{
			lp.setlogout();
			driver.switchTo().alert().accept();
			Assert.assertTrue(true);
		}
	}
	
	
	@DataProvider(name="LoginTest")
	public String[][] getData() throws IOException
	{
		String file="/SELAUTJUN29/src/test/java/TestData/LoginDataTest.xlsx";
		int rowcount=XLUtils.getRowCount(file,"Sheet1");
		int colcount=XLUtils.getCellCount(file, "Sheet1", 1);
		
		String Logindata[][]=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				Logindata[i-1][j]=XLUtils.getCellData(file, "Sheet1", i, j);
			}
		}
		return Logindata;
		
	}

}
