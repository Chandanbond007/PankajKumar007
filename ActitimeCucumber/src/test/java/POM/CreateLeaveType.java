package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateLeaveType 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	
	@FindBy(xpath="//input[@placeholder='Enter name']")
	private WebElement leavenameText;
	
	@FindBy(xpath="//span[text()='Save']/..")
	private WebElement leavesaveButton;
	
	@FindBy(xpath="//span[text()='Personal']/../../../../../.."
			+ "//div[@class='components-ItemListPage-ItemActions-trigger--p04fBAlu']")
	private WebElement actionLeaveType;
	
	@FindBy(xpath="//span[text()='Delete']/..")
	private WebElement leaveDelete;
	
	@FindBy(xpath="//button[text()='OK, Delete']")
	private WebElement leaveOkDelete;
			
	
	public CreateLeaveType(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void leavenameTextMethod(String name)
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(leavenameText));
		
		leavenameText.sendKeys(name);
	}
	
	public void leavesaveButtonMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(leavesaveButton));
		
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", leavesaveButton);
		Thread.sleep(2000);
	}
	
	public void actionLeaveTypeMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(actionLeaveType));
		
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", actionLeaveType);
		Thread.sleep(1000);
	}
	
	public void leaveDeleteMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(leaveDelete));
		
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", leaveDelete);
		Thread.sleep(1000);
	}
	
	public void leaveOkDeleteMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(leaveOkDelete));
		
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", leaveOkDelete);
		Thread.sleep(2000);
	}

}
