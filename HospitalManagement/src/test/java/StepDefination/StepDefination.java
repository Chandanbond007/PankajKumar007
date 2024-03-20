package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.HmLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination extends HMBaseClass 
{
	
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void teardown(Scenario sc)
	{
		System.out.println("Teardown executed");
		
		String name=sc.getName();
		String filepath="./Screenshot/"+name+".png";
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		if(sc.isFailed()) 
		{
			//Attaching it in report
			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot,"image/png",name+"FailedScreenshot");
			
			
			//Saving the screenshot in a folder inside the project
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(filepath);
			
			try 
			{
				FileUtils.copyFile(src, dest);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		driver.quit();
		log1.info("Browser Closed");
	}
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
		log1=LogManager.getLogger(StepDefination.class);
	    login=new HmLoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) 
	{
		log1.info("Entered the url");
	    driver.get(URL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String Password) 
	{
		log1.info("Entered the email");
		login.emailLinkMethod(Email);
		
		log1.info("Entered the password");
		login.pwdLinkMethod(Password);
	}

	@When("Click on Login")
	public void click_on_login() 
	{
	    login.loginButtonMethod();
	    log1.info("Login success");
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expected) throws Throwable 
	{
		Thread.sleep(10000);
	    String actual=driver.getTitle();
	    System.out.println(actual + "is Actual");
	    System.out.println(expected + "is Expected");
	    
	    if(expected.equals(actual))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}

	@When("User Click on Log out link")
	public void user_click_on_log_out_link() 
	{
	    login.logoutLinkMethod();
	    log1.info("Logout success");
	}

	@Then("Close browser")
	public void close_browser() 
	{
	    driver.quit();
	    log1.info("Browser Closed");
	}

}