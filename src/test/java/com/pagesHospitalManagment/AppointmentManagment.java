package com.pagesHospitalManagment;

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

public class AppointmentManagment extends BasePage implements AutoConstant
{
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@FindBy(xpath="//input[@name='date_timestamp']")
	private WebElement dateLink;
	
	@FindBy(xpath="//input[@name='time_timestamp']")
	private WebElement timeLink;
	
	@FindBy(xpath="//span[@class='select2-arrow']/..")
	private WebElement selectpatientnameLink;
	
	@FindBy(xpath="//input[@autocorrect='off']")
	private WebElement selectnameLink;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submitButton;
	
	
	@FindBy(xpath="//td[text()='rashmi']/..//a[@class='btn btn-danger btn-sm btn-icon icon-left']")
	private WebElement deleteLink;
	
	public AppointmentManagment(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void dateMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(dateLink));
		
		javascriptHighlightElement(driver,dateLink);
		
		dateLink.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 9, 0));
		ExcelLibrary.getStringCellTypeData(sheet_login, 9, 0);
		
		javascriptClick(driver,dateLink);
	}
	
	public void timeMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(timeLink));
		
		javascriptHighlightElement(driver,timeLink);
		
		timeLink.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 9, 1));
		ExcelLibrary.getStringCellTypeData(sheet_login, 9, 1);
		
		javascriptClick(driver,timeLink);
	}
	
	public void selectpatientlinkMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(selectpatientnameLink));
		
		javascriptHighlightElement(driver,selectpatientnameLink);
		
		javascriptClick(driver,selectpatientnameLink);
		
	}
	
	public void patientnameMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(selectnameLink));
		
		javascriptHighlightElement(driver,selectnameLink);
		
		selectnameLink.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 9, 2));
		ExcelLibrary.getStringCellTypeData(sheet_login, 9, 2);
		
		javascriptClick(driver,selectnameLink);
	}
	
	public void submitMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(submitButton));
		
		javascriptHighlightElement(driver,submitButton);
		
		javascriptClick(driver,submitButton);
	}

}