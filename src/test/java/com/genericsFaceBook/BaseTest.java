package com.genericsFaceBook;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.generics.ActiTime.AutoConstant;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void suiteExceutionStart()
	{
		Reporter.log("Execution started at suite tag level", true);
	}
	
	@BeforeTest
	public void testExecutionStart()
	{
		Reporter.log("Execution started at test tag level", true);
	}
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) throws IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
			
			FileInputStream fis=new FileInputStream(properties_path);
			Properties properties=new Properties();
			properties.load(fis);
			
			driver.get(properties.getProperty("url"));
		}
		
//		else if(browser.equalsIgnoreCase("edge"))
//		{
//			driver=new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
//			
//			FileInputStream fis=new FileInputStream(properties_path);
//			Properties properties=new Properties();
//			properties.load(fis);
//			
//			driver.get(properties.getProperty("url"));
//		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(80));
			
			FileInputStream fis=new FileInputStream(properties_path);
			Properties properties=new Properties();
			properties.load(fis);
			
			driver.get(properties.getProperty("url"));
		}
	}
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();
	}
	
	@AfterTest
	public void testExceutionComplete()
	{
		Reporter.log("Exceution completed at test tag level");
	}
	
	@AfterSuite
	public void suiteExceutionComplete()
	{
		Reporter.log("Exceution completed at siute tag level");
	}
}