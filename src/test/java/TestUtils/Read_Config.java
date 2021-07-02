package TestUtils;

import java.io.FileInputStream;

import java.util.Properties;

public class Read_Config {
	
	Properties pro;
	
	public Read_Config()
	{
		try
		{
		
			FileInputStream fis=new FileInputStream("/SELAUTJUN29/Properties/Config.Properties");
			 pro=new Properties();
			pro.load(fis);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		}
	
	public String getURL()
	{
		String url=pro.getProperty("BaseURL");
		return url;
		
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("Username");
		return username;
	}
	
	public String getPassword()
	{
		String pwd=pro.getProperty("Password");
		return pwd;
	}
	
	public String getChropath()
	{
		String chropath=pro.getProperty("Chropath");
		return chropath;
	}
	
	
}
