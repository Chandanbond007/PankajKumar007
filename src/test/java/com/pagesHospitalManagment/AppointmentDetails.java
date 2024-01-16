package com.pagesHospitalManagment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generics.ActiTime.BasePage;

public class AppointmentDetails extends BasePage
{
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	
	@FindBy(xpath="//span[text()='Appointment']/..")
	private WebElement appointmentLink;
	
	@FindBy(xpath="//span[text()='Appointment List']")
	private WebElement subappointmentLink;
	
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement addappointmentlink;
	
	public AppointmentDetails(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void appointmentMethod() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(appointmentLink));
		
		javascriptHighlightElement(driver,appointmentLink);
		
		javascriptClick(driver,appointmentLink);
	}
	
	public void subappointmentMethod() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(subappointmentLink));
		
		javascriptHighlightElement(driver,subappointmentLink);
		
		javascriptClick(driver,subappointmentLink);
	}
	
	public void addappointmentMethod() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(addappointmentlink));
		
		javascriptHighlightElement(driver,addappointmentlink);
		
		javascriptClick(driver,addappointmentlink);
	}

}