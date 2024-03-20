package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ValidateCustomer 
{
	public WebDriver driver;

	@FindBy(xpath="//tr[@class='odd']//td[text()='Indian Cricket Team']")
	private WebElement company;

	public ValidateCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void companyMethod()
	{
		String name=company.getText();
		System.out.println(name);
		String expected="Indian Cricket Team";
		Assert.assertEquals(name, expected, "Text validation not success");
		Reporter.log("Text matched");
	}

}
