package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
	Properties properties;
	String path="C:\\Users\\mechr\\OneDrive\\Desktop\\Cucumber\\ActitimeCucumber\\Properties\\config.properties";

	public ReadConfig()
	{
		properties = new Properties();
		FileInputStream fis;
		try 
		{
			fis=new FileInputStream(path);
			properties.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBrowser()
	{
		String value=properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("URL is not matching or not specified");
	}

}