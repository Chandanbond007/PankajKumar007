package StepDefination;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import POM.ActitimeHome;
import POM.ActitimeLogin;
import POM.CreateLeaveType;
import POM.CreateNewCustomer;
import POM.CreateWork;
import utilities.ReadConfig;

public class ActBaseClass 
{
	public WebDriver driver;
	public ActitimeLogin login;
	public ActitimeHome home;
	public CreateNewCustomer create;
	public CreateWork work;
	public CreateLeaveType leave;
	public ReadConfig Readconfig;
	public Logger log;
	
	

}