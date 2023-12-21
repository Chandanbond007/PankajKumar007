package com.pagesActiTime;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generics.ActiTime.BasePage;


public class ActitimeHomePage extends BasePage
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutmethod() throws InterruptedException
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(80));
	
		javascriptHighlightElement(driver,logoutButton);
		javascriptClick(driver,logoutButton);
	}
}