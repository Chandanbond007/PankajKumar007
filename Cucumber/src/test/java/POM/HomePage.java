package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver ldriver;

	@FindBy(xpath="(//li[@class='nav-item has-treeview'])[4]")
	private WebElement customersLink;
	
	@FindBy(xpath="//p[text()=' Customers']")
	private WebElement CustomersText;
	
	
	
	public HomePage(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	public void customerMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver; 
		js.executeScript("arguments[0].click()", customersLink);		
//		customersLink.click();
		
	}
	
	public void customerOptionMethod()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", CustomersText);
//		CustomersText.click();
	}


}
