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

public class EnterDataHealthcare extends BasePage implements AutoConstant
{
	
	public WebDriver driver;;
	public WebDriver Wait;
	
	
	@FindBy(id="email")
	private WebElement emailTextfield;
	
	@FindBy(id="password")
	private WebElement paswordTextfield;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block btn-login']")
	private WebElement loginButton;
	
	
	public EnterDataHealthcare(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enteremailMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(emailTextfield));
		
		javascriptHighlightElement(driver,emailTextfield);
		
		emailTextfield.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 4, 0));
		ExcelLibrary.getStringCellTypeData(sheet_login, 4, 0);
	}
	
	public void enterpasswordMethod() throws InterruptedException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(paswordTextfield));
		
		javascriptHighlightElement(driver,paswordTextfield);
		
		paswordTextfield.sendKeys(ExcelLibrary.getStringCellTypeData(sheet_login, 4, 1));
		ExcelLibrary.getStringCellTypeData(sheet_login, 4, 1);
	
	}
	
	public void loginMethod() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		
		javascriptHighlightElement(driver,loginButton);
		
		javascriptClick(driver,loginButton);
	}

}