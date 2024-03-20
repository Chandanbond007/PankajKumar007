package POM;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Customerpage 
{
  public WebDriver driver;
  
  @FindBy(xpath="//input[@type='email']")
  private WebElement emailfield;
  
  @FindBy(xpath="//input[@name='SearchFirstName']")
  private WebElement firstnamefield;
  
  @FindBy(xpath="//input[@name='SearchLastName']")
  private WebElement lastnamefield;
  
  @FindBy(xpath="//select[@id='SearchMonthOfBirth']")
  private WebElement monthselect;
  
  @FindBy(xpath="//select[@id='SearchDayOfBirth']")
  private WebElement dayselect;
  
  @FindBy(xpath="//input[@name='SearchRegistrationDateFrom']")
  private WebElement datefrom;
  
  @FindBy(xpath="//input[@name='SearchRegistrationDateFrom']")
  private WebElement dateto;
  
  @FindBy(xpath="//input[@name='SearchLastActivityFrom']")
  private WebElement activityfrom;
  
  @FindBy(xpath="//input[@name='SearchLastActivityTo']")
  private WebElement activityto;
  
  @FindBy(xpath="//input[@name='SearchCompany']")
  private WebElement companyname;
  
  @FindBy(xpath="//input[@name='SearchIpAddress']")
  private WebElement ipadress;
  
//  @FindBy(xpath="//select[@role='listbox']")
//  private WebElement customerroles;
  
  
  public Customerpage(WebDriver driver)
  {
	  this.driver= driver;
	  PageFactory.initElements(driver, this);
  }
  
  public void emailoption(String email)
  {
	  emailfield.sendKeys(email);
  }
  public void firstnameoption(String firstName)
  {
	  firstnamefield.sendKeys(firstName);
  }
  public void lastnameoption(String lastName)
  {
	  lastnamefield.sendKeys(lastName);
  }
  public void monthselectoption(String Month)
  {
	  monthselect.click();
	  Select select= new Select(monthselect);
	  select.selectByValue(Month);
  }
  public void dayselectoption(String day)
  {
	  dayselect.click();
	  Select select= new Select(dayselect);
	  select.selectByValue(day);
  }
  public void datefromoption(String date)
  {
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].value= 'date'", datefrom);
  }
  public void datetooption(String Date)
  {
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].value= 'Date'", dateto);
  }
  public void activityfromoption(String date1)
  {
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].value= 'date1'", activityfrom);
  }
  public void activitytooption(String Date1)
  {
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].value= 'Date1'", activityto);
  }
  public void companyoption(String company)
  {
	  companyname.sendKeys(company);
  }
  public void ipoption(String IP)
  {
	  ipadress.sendKeys(IP);
  }
//  public void customeroption(String role)
//  {
//	  customerroles.click();
//	  Select  select= new Select(customerroles);
//	  select.selectByVisibleText(role);
//  }
}