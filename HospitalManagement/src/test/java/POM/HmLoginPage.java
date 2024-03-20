package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmLoginPage 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	
	@FindBy(id="email")
	private WebElement emailLink;
	
	@FindBy(id="password")
	private WebElement pwdLink;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block btn-login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[@href='http://106.51.87.42:9007/index.php?login/logout']")
	private WebElement logoutLink;
	
	public HmLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void emailLinkMethod(String Email)
	{
		emailLink.sendKeys(Email);
	}
	
	public void pwdLinkMethod(String Password)
	{
		pwdLink.sendKeys(Password);
	}
	
	public void loginButtonMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginButton);
	}
	
	public void logoutLinkMethod()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", logoutLink);
	}

}
