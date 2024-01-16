package com.pagesFacebook;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generics.ActiTime.AutoConstant;
import com.generics.ActiTime.ExcelLibrary;
import com.genericsFaceBook.BasePage;

public class FacebookCreateAccountData  extends BasePage implements AutoConstant
{
	public WebDriver driver;;
	public WebDriver Wait;
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createAccountLink;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotLink;
	
	@FindBy(id="identify_email")
	private WebElement emailText;;
	
	@FindBy(xpath="//input[@aria-label='First name']")
	private WebElement firstNameLink;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement surNameLink;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobilenoLink;

	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement passwordLink;
	
	@FindBy(id="day")
	private WebElement datetext;
	
	@FindBy(id="month")
	private WebElement monthtext;
	
	@FindBy(id="year")
	private WebElement yeartext;
	
	@FindBy(xpath="//label[text()='Male']/..//input[@type='radio']")
	private WebElement maleradioLink;;
	
	public FacebookCreateAccountData(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void createaccountMethod() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(createAccountLink));
		
		javascriptHighLightElement(driver,createAccountLink);
		javascriptClick(driver,createAccountLink);
	}
	
	public void forgotLinkMethod() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(forgotLink));
		
		javascriptHighLightElement(driver,forgotLink);
		javascriptClick(driver,forgotLink);
	}
	
	public void emailtextMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(emailText));
		
		javascriptHighLightElement(driver,emailText);
		
		emailText.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 1, 6));
		ExcelLibrary.getStringCellTypeData(sheet_login, 1, 6);
	}
	
	public void firstnameMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(firstNameLink));
		
		javascriptHighLightElement(driver,firstNameLink);
		
		firstNameLink.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 1, 2));
		ExcelLibrary.getStringCellTypeData(sheet_login, 1, 2);
		
	}
	
	public void lastnameMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(surNameLink));
		
		javascriptHighLightElement(driver,surNameLink);
		
		surNameLink.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 1, 3));
		ExcelLibrary.getStringCellTypeData(sheet_login, 1, 3);
		
	}
	
	public void mobilenoMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(mobilenoLink));
		
		javascriptHighLightElement(driver,mobilenoLink);
		
		mobilenoLink.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 1, 4));
		ExcelLibrary.getStringCellTypeData(sheet_login, 1, 4);
		
	}

	public void passwordlinkMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(passwordLink));
		
		javascriptHighLightElement(driver,passwordLink);
		
		passwordLink.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 1, 5));
		ExcelLibrary.getStringCellTypeData(sheet_login, 1, 5);
		
	}
	
	public void dateMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(datetext));
		
		javascriptHighLightElement(driver,datetext);
		
		datetext.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 1, 7));
		ExcelLibrary.getStringCellTypeData(sheet_login, 1, 7);
		
	}
	
	public void monthMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(monthtext));
		
		javascriptHighLightElement(driver,monthtext);
		
		monthtext.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 1, 8));
		ExcelLibrary.getStringCellTypeData(sheet_login, 1, 8);
		
	}
	
	public void yearMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(yeartext));
		
		javascriptHighLightElement(driver,yeartext);
		
		yeartext.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 1, 9));
		ExcelLibrary.getStringCellTypeData(sheet_login, 1, 9);
		
	}
	
	public void malelinkMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(maleradioLink));
		
		javascriptHighLightElement(driver,maleradioLink);
		
		javascriptClick(driver,maleradioLink);
		
	}
}