package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin 
{
	public WebDriver driver;
	public JavascriptExecutor js;
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//div[text()='Login ']/..")
	private WebElement loginButton;
	
	
	public ActitimeLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void usernameMethod(String email)
	{
		usernameTextfield.sendKeys(email);
	}
	
	public void pwdMethod(String pwd)
	{
		passwordTextfield.sendKeys(pwd);
	}
	
	public void loginMethod() throws Throwable
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginButton);
		Thread.sleep(5000);
		
	}

}
