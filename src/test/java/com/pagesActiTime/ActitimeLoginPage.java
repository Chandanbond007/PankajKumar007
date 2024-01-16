package com.pagesActiTime;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.generics.ActiTime.AutoConstant;
import com.generics.ActiTime.BasePage;
import com.generics.ActiTime.ExcelLibrary;


public class ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[text()='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws InterruptedException, IOException
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
		
		javascriptHighlightElement(driver,usernameTextfield);
		
		usernameTextfield.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login,1,0));
		ExcelLibrary.getStringCellTypeData(sheet_login,1,0);
		
		
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOf(passwordTextfield));
		
		javascriptHighlightElement(driver,passwordTextfield);
		
		passwordTextfield.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login,1,1));
		ExcelLibrary.getStringCellTypeData(sheet_login,1,1);
		
		
		
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(80));
		wait.until(ExpectedConditions.visibilityOf(keepmeloggedinCheckbox));
		
		javascriptHighlightElement(driver,keepmeloggedinCheckbox);
		
		javascriptClick(driver,keepmeloggedinCheckbox);
		
		
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOf(loginButton));;
		
		javascriptHighlightElement(driver,loginButton);
		
		javascriptClick(driver,loginButton);
		
		
		
	}	
}	