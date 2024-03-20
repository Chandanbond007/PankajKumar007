package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateWork 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	

	@FindBy(id="title")
	private WebElement titlenameLink;
	
	@FindBy(xpath="//span[text()='Save']/..")
	private WebElement saveButton;
	
	public CreateWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void titlenameLinkMethod(String name) throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(titlenameLink));
		
		titlenameLink.sendKeys(name);
		Thread.sleep(3000);
		
	}
	
	public void saveButtonMethod() throws Throwable
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(saveButton));
		
		
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", saveButton);
		Thread.sleep(2000);
		
	}

}
