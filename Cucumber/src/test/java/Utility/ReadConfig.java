package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
	Properties properties;
	String path="C:\\Users\\mechr\\OneDrive\\Desktop\\Cucumber\\Cucumber\\Properties\\config.properties";
	public ReadConfig()
	{
		properties= new Properties();
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(path);
			properties.load(fis);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
			e.printStackTrace();
		}
	}
	
	public String getBrowser()
	{
		String value = properties.getProperty("browser");
		if(value!=null)
		return value;
		else
			throw new RuntimeException("URL is not matching or not declared");
	}
}