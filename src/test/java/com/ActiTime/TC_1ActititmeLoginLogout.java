package com.testcases.ActiTime;

import java.io.IOException;

//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.ActiTime.BaseTest;
import com.pagesActiTime.ActitimeHomePage;
import com.pagesActiTime.ActitimeLoginPage;


//@Listeners(generics.ScreenShot.class)
public class TC_1ActititmeLoginLogout extends BaseTest
{
	@Test
	public void login() throws InterruptedException, IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods="login")
	public void logout() throws InterruptedException
	{
		ActitimeHomePage homepage=new ActitimeHomePage(driver);
		homepage.logoutmethod();
	}
}