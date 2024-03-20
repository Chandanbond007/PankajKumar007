package StepDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import POM.Addnewcustomer;
import POM.HomePage;
import POM.LoginPage;
import POM.SearchCustomer;
import POM.ValidateCustomer;
import Utility.ReadConfig;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage login;
	public HomePage home;
	public SearchCustomer customer;
	public ValidateCustomer cos;
	public Addnewcustomer newcustomer;
	public Logger log;
	public ReadConfig readconfig;
	
	
}