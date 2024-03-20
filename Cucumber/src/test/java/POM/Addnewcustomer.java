package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addnewcustomer 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement addnewButton;
	
	@FindBy(id="Email")
	private WebElement emailfield;
	
	@FindBy(id="Password")
	private WebElement pwdfield;
	
	@FindBy(id="FirstName")
	private WebElement firstname;
	
	@FindBy(id="LastName")
	private WebElement lastname;
	
	@FindBy(xpath="(//label[@class='form-check-label']/../../../..//input[@type='radio'])[1]")
	private WebElement maleradiobutton;
	
	@FindBy(id="DateOfBirth")
	private WebElement dobfield;
	
	@FindBy(id="Company")
	private WebElement companyfield;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]/../..")
	private WebElement taxcheckbox;
	
	@FindBy(xpath="(//div[@role='listbox'])[1]")
	private WebElement listbox;
	
	@FindBy(xpath="//li[text()='Your store name']")
	private WebElement selectnewsletter;
	
	@FindBy(id="AdminComment")
	private WebElement admincomment;
	
	@FindBy(xpath="//button[@name='save']")
	private WebElement saveButton;
	
	public Addnewcustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addnewButtonMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addnewButton);
	}
	
	public void emailfieldMethod(String emailAdd)
	{
		emailfield.sendKeys(emailAdd);
	}
	
	public void pwdfieldMethod(String pwdAdd)
	{
		pwdfield.sendKeys(pwdAdd);
	}
	
	public void firstnameMethod(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void lastnameMethod(String lname)
	{
		firstname.sendKeys(lname);
	}
	
	public void genderMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", maleradiobutton);
	}
	
	public void dobfieldMethod(String dob)
	{
		dobfield.sendKeys(dob);
	}
	
	public void companyfieldMethod(String comp)
	{
		companyfield.sendKeys(comp);
	}
	
	public void taxcheckboxMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", taxcheckbox);
	}
	
	public void listboxMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", listbox);
	}
	
	public void selectnewsletter()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", selectnewsletter);
	}
	
	public void commentMethod(String msg)
	{
		admincomment.sendKeys(msg);
	}
	
	public void saveButtonMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", saveButton);
	}
	
}