package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomer 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	
	@FindBy(id="SearchCompany")
	private WebElement companyName;
	
	@FindBy(id="search-customers")
	private WebElement searchButton;
	
	public SearchCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void compMethod(String comp)
	{
		companyName.sendKeys(comp);
	}
	
	public void searchMethod() throws Throwable
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", searchButton);
		Thread.sleep(5000);
		
	}

}
