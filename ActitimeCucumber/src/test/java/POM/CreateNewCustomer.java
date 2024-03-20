package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewCustomer 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	public WebDriverWait wait;
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement nameText;
	
	@FindBy(xpath="//div[text()='Create Customer']/..")
	private WebElement createButton;
	
	public CreateNewCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void nameMethod(String Name)
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(nameText));
		
		nameText.sendKeys(Name);
	}
	
	public void createMethod() throws Throwable
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", createButton);
		Thread.sleep(3000);
	}

}
