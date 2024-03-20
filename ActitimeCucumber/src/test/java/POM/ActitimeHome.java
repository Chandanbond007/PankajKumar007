package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeHome 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	
	@FindBy(xpath="//div[text()='Tasks']/..")
	private WebElement TaskLink;
	
	@FindBy(xpath="//div[text()='Add New']/..")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerLink;
	
	@FindBy(xpath="//div[text()='Pankaj']/..//div[@class='editButton']")
	private WebElement editButton;
	
	@FindBy(xpath="(//div[text()='Delete'])[2]/..")
	private WebElement customerDelete;
	
	@FindBy(xpath="//span[text()='Delete permanently']/..")
	private WebElement customerFinalDelete;
	
	@FindBy(xpath="(//div[text()='ACTIONS'])[1]/..")
	private WebElement actionsButton;
	
	@FindBy(xpath="//div[text()='Delete']/..")
	private WebElement workdeleteLink;
	
	@FindBy(xpath="//button[text()='OK, Delete']")
	private WebElement workfinaldeleteLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	@FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
	private WebElement menuLink;
	
	@FindBy(xpath="//a[text()='Types of Work']")
	private WebElement typeOfWorkLink;
	
	@FindBy(xpath="//div[text()='New Type']/..")
	private WebElement newtypeLink;
	
	@FindBy(xpath="//span[text()='Business']/../../../../../.."
			+ "//span[contains(@class,'components-Checkbox-checkbox')]")
	private WebElement checkbox;
	
	////////Create Laeve Type///////////
	
	@FindBy(xpath="//a[text()='Leave Types']")
	private WebElement leavetypelink;
	
	@FindBy(xpath="//div[text()='New Type']/..")
	private WebElement newtypeLeavelink;
	
	
	public ActitimeHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void TaskLinkMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(TaskLink));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", TaskLink);
	}
	
	public void addnewButtonMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(addnewButton));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", addnewButton);
	}
	
	public void newcustomerLinkMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", newcustomerLink);
	}
	
	public void editMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(editButton));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", editButton);
	}
	
	public void actionsButtonMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(actionsButton));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", actionsButton);
	}
		
	public void workdeleteLinkLinkMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(workdeleteLink));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", workdeleteLink);
	}
	
	public void fworkfinaldeleteLinkMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(workfinaldeleteLink));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", workfinaldeleteLink);
	}
	
	public void logoutMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(logoutButton));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", logoutButton);
		Thread.sleep(3000);
		
	}
	
	public void menuLinkMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(menuLink));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", menuLink);
		Thread.sleep(3000);
		
	}
	
	public void typeOfWorkLinkMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(typeOfWorkLink));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", typeOfWorkLink);
		Thread.sleep(3000);
		
	}
	
	public void newtypeLinkMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(newtypeLink));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", newtypeLink);
		Thread.sleep(3000);
		
	}
	
	public void checkboxMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", checkbox);
		Thread.sleep(3000);
		
	}
	
	public void customerDeleteMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(customerDelete));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", customerDelete);
		Thread.sleep(3000);
		
	}
	
	public void customerFinalDeleteMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(customerFinalDelete));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", customerFinalDelete);
		Thread.sleep(3000);
		
	}
	
	public void leavetypelinkMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(leavetypelink));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", leavetypelink);
	}
	
	
	public void newtypeLeavelinkMethod()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(newtypeLeavelink));
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", newtypeLeavelink);
	}
	
	
	
	

}
