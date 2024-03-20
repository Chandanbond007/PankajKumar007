package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public WebDriver ldriver;
	public JavascriptExecutor js;

	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	private WebElement LoginBtn;
	
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	
	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()",LoginBtn );
		//LoginBtn.click();
	}
	
	public void clickOnLogOutButton()
	{
		js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()",logout );
		//logout.click();
	}

}
