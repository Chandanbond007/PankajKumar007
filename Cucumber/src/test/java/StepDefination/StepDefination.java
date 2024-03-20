package StepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import POM.Addnewcustomer;
import POM.HomePage;
import POM.LoginPage;
import POM.SearchCustomer;
import POM.ValidateCustomer;
import Utility.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination extends BaseClass 
{

	@Before
	public void setup()
	{
		log = LogManager.getLogger(StepDefination.class);
		log.info("Browser opened");
		readconfig= new ReadConfig();
		String browser=readconfig.getBrowser();

		//Launch Browser
		switch(browser.toLowerCase())
		{
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

		case "msedge" :
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		default :
			driver=null;
			break;
		}


		driver.manage().window().maximize();
		log.info("Browser maximised");

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
	}

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
		login=new LoginPage(driver);
		home=new HomePage(driver);
		customer=new SearchCustomer(driver);
		cos=new ValidateCustomer(driver);
		newcustomer=new Addnewcustomer(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL)
	{
		log.info("Entered the URL");
		driver.get(URL);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String Password) 
	{
		login.enterEmail(Email);
		log.info("Entered the email id");
		login.enterPassword(Password);
		log.info("Entered the password");
	}

	@When("Click on Login")
	public void click_on_login() 
	{
		login.clickOnLoginButton();
		log.info("Logged in successfully");
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expected) 
	{
		String Actual=driver.getTitle();
		if(expected.equals(Actual))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

	@Then("click on Customers Major tab")
	public void click_on_customers_major_tab() 
	{
		home.customerMethod();
	}

	@Then("click on customers Minor tab")
	public void click_on_customers_minor_tab() 
	{
		home.customerOptionMethod();
	}

	@Then("page title must be {string}")
	public void page_title_must_be(String expected) 
	{
		String Actual=driver.getTitle();
		if(expected.equals(Actual))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@Then("User enters Comp as {string}")
	public void user_enters_comp_as(String Comp) 
	{
		customer.compMethod(Comp);
	}

	@Then("Click on search button")
	public void click_on_search_button() throws Throwable 
	{
		customer.searchMethod();
	}

	////////////////Validating////////////////////////////

	@Then("Customer data validation should be {string}")
	public void customer_data_validation_should_be(String string) 
	{
		cos.companyMethod();
	}

	@Then("Close browser")
	public void close_browser() 
	{
		driver.close();
		log.info("Browser closed successfully");
	}

	//////////////////Logout Link//////////////////////////

	@When("User Click on Log out link")
	public void user_click_on_log_out_link() 
	{
		login.clickOnLogOutButton();
		log.info("Logged out successfully");
	}

	//////////////////AddNewCustomer//////////////////////////


	@Then("click on add new button")
	public void click_on_add_new_button() 
	{
		newcustomer.addnewButtonMethod();
	}

	@Then("user enter email as {string}")
	public void user_enter_email_as(String email) 
	{
		newcustomer.emailfieldMethod(email);
	}

	@Then("user enter pwd as {string}")
	public void user_enter_pwd_as(String pwd) 
	{
		newcustomer.pwdfieldMethod(pwd);
	}

	@Then("user enter firstName as {string}")
	public void user_enter_first_name_as(String firstName) 
	{
		newcustomer.firstnameMethod(firstName);
	}

	@Then("user enter lastName as {string}")
	public void user_enter_last_name_as(String lastName) 
	{
		newcustomer.lastnameMethod(lastName);
	}

	@Then("click on Gender and select the checkbox")
	public void click_on_gender_and_select_the_checkbox() 
	{
		newcustomer.genderMethod();
	}

	@Then("click on DOB and enter Dob as {string}")
	public void click_on_dob_and_enter_dob_as(String DOB) 
	{
		newcustomer.dobfieldMethod(DOB);
	}

	@Then("user enter the company name as {string}")
	public void user_enter_the_company_name_as(String company) 
	{
		newcustomer.companyfieldMethod(company);
	}

	@Then("click on tax exempt checkbox")
	public void click_on_tax_exempt_checkbox() 
	{
		newcustomer.taxcheckboxMethod();
	}

	@Then("click on newsletter ans enter the store name")
	public void click_on_newsletter_ans_enter_the_store_name() 
	{
		newcustomer.selectnewsletter();
	}

	@Then("clicked on admin comment and enter the message as {string}")
	public void clicked_on_admin_comment_and_enter_the_message_as(String admin) 
	{
		newcustomer.commentMethod(admin);
	}

	@Then("clicked on save button")
	public void clicked_on_save_button() 
	{
		newcustomer.saveButtonMethod();
	}

}