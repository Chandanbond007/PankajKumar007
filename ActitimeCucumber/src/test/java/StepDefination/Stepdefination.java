package StepDefination;

import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.*;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import POM.ActitimeHome;
import POM.ActitimeLogin;
import POM.CreateLeaveType;
import POM.CreateNewCustomer;
import POM.CreateWork;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

public class Stepdefination extends ActBaseClass
{
	
	@Before
	public void setup()
	{
		log = LogManager.getLogger(Stepdefination.class);
		Readconfig = new ReadConfig();
		
		String browser= Readconfig.getBrowser();
		
		switch(browser.toLowerCase())
		{
		case "chrome" :
			log.info("Driver setup");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "msedge" :
			log.info("Driver setup");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
		case "firefox" :
			log.info("Driver setup");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
			default :
				driver = null;
				break;
		}
		driver.manage().window().maximize();
		log.info("Launched Chrome Browser");
	}

	@After
	public void teardown(Scenario sc)
	{
		System.out.println("Teardown executed");
		
		String name=sc.getName();
		String filepath="./ActitimeScreenshot/"+name+".png";
		
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
	}


	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser()
	{
		log.info("Browser Lunched Sucessfully");
		login=new ActitimeLogin(driver);
		home=new ActitimeHome(driver);
		create=new CreateNewCustomer(driver);
		work=new CreateWork(driver);
		leave=new CreateLeaveType(driver); 

	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) 
	{
		log.info("User able to put URL");
		log.info("Entered the URL");
		driver.get(URL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String Password) 
	{
		login.usernameMethod(Email);
		log.info("Entered the email");
		login.pwdMethod(Password);
		log.info("Entered the password");
	}

	@When("Click on Login")
	public void click_on_login() throws Throwable 
	{
		login.loginMethod();
		log.info("Logged in successfully");
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String exp) 
	{
		String actual=driver.getTitle();
//		if(exp.equals(actual))
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
		Assert.assertEquals(actual, exp, "not match");
		System.out.println("match");
	}

	@When("User Click on Log out link")
	public void user_click_on_log_out_link() throws Throwable 
	{
		home.logoutMethod();
		log.info("Logged out successfully");
	}

	@Then("Close browser")
	public void close_browser() 
	{
		driver.quit();
		log.info("Browser Closed");
	}


	/////////////////Create Customer And Delete Customer////////////////
	
	@When("User Click on Tasks Link")
	public void user_click_on_tasks_link() 
	{
	    home.TaskLinkMethod();
	}

	@When("User Click on Add New option")
	public void user_click_on_add_new_option() 
	{
	    home.addnewButtonMethod();
	}

	@When("User Click on New Customers link")
	public void user_click_on_new_customers_link() 
	{
	    home.newcustomerLinkMethod();
	}

	@When("User enter Customer Name as {string}")
	public void user_enter_customer_name_as(String Name) 
	{
	    create.nameMethod(Name);
	}

	@When("User Click on Create Customer Link")
	public void user_click_on_create_customer_link() throws Throwable 
	{
	    create.createMethod();
	}

	@When("User click on customer settings icon")
	public void user_click_on_customer_settings_icon() 
	{
	    home.editMethod();
	}

	@When("User click on actions icon")
	public void user_click_on_actions_icon() 
	{
	    home.actionsButtonMethod();
	}

	@When("User click on delete link")
	public void user_click_on_delete_link() throws Throwable 
	{
	    home.customerDeleteMethod();
	}

	@When("User click on delete permanently button")
	public void user_click_on_delete_permanently_button() throws Throwable 
	{
	    home.customerFinalDeleteMethod();
	}
	
	//////////////////////Create Work And Delete Work/////////////////
	
	@When("User clicks on setting menu icon")
	public void user_clicks_on_setting_menu_icon() throws Throwable 
	{
	    home.menuLinkMethod();
	}

	@When("Clcik on Types Of Work")
	public void clcik_on_types_of_work() throws Throwable 
	{
	    home.typeOfWorkLinkMethod();
	}

	@When("Click on New Type button")
	public void click_on_new_type_button() throws Throwable 
	{
	    home.newtypeLinkMethod();
	}

	@When("User enter the type of work name as {string}")
	public void user_enter_the_type_of_work_name_as(String name) throws Throwable 
	{
	    work.titlenameLinkMethod(name);
	}

	@When("User click on Save button")
	public void user_click_on_save_button() throws Throwable 
	{
	    work.saveButtonMethod();
	}

	@When("User clicks on checkbox of newly created work")
	public void user_clicks_on_checkbox_of_newly_created_work() throws Throwable 
	{
	    home.checkboxMethod();
	    Thread.sleep(1000);
	}

	@When("User click on Delete Icon")
	public void user_click_on_delete_icon() throws Throwable 
	{
	    home.workdeleteLinkLinkMethod();
	    Thread.sleep(2000);
	}

	@When("User Click on Ok,Delete Icon")
	public void user_click_on_ok_delete_icon() throws Throwable 
	{
	    home.fworkfinaldeleteLinkMethod();
	    Thread.sleep(1000);
	}
	
	@When("User refresh the page")
	public void user_refresh_the_page() 
	{
	    driver.navigate().refresh();
	}
	
/////////////Create LeaveType And Delete LeaveType/////////////////
	
	@When("Clcik on Leave Types")
	public void clcik_on_leave_types() 
	{
	    home.leavetypelinkMethod();
	}

	@When("Click on New Type button of Leave Type")
	public void click_on_new_type_button_of_leave_type() 
	{
	    home.newtypeLeavelinkMethod();
	}

	@When("User enter the type of Leave name as {string}")
	public void user_enter_the_type_of_leave_name_as(String name) 
	{
	    leave.leavenameTextMethod(name);
	}

	@When("User click on Save button of Create Leave Type")
	public void user_click_on_save_button_of_create_leave_type() throws Throwable 
	{
	    leave.leavesaveButtonMethod();
	}

	@When("User clicks on action dots of newly created leave")
	public void user_clicks_on_action_dots_of_newly_created_leave() throws Throwable 
	{
	    leave.actionLeaveTypeMethod();
	}

	@When("User click on Delete Icon of Leave Types")
	public void user_click_on_delete_icon_of_leave_types() throws Throwable 
	{
	    leave.leaveDeleteMethod();
	}

	@When("User Click on Ok,Delete Icon of Leave Types")
	public void user_click_on_ok_delete_icon_of_leave_types() throws Throwable 
	{
	    leave.leaveOkDeleteMethod();
	    Thread.sleep(1000);
	}

	@When("Close the browser")
	public void close_the_browser() 
	{
	    driver.quit();
	}
}