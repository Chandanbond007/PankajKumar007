package com.testcasesFacebook;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.ActiTime.BaseTest;
import com.pagesFacebook.FacebookCreateAccountData;


public class TC_1FacebookCreateAccountEnterData extends BaseTest
{
	@Test
	public void opennewAccount() throws InterruptedException, IOException
	{
		FacebookCreateAccountData create=new FacebookCreateAccountData(driver);
		
		create.createaccountMethod();
		
		create.firstnameMethod();
		Thread.sleep(3000);
		
		create.lastnameMethod();
		Thread.sleep(3000);
		
		create.mobilenoMethod();
		Thread.sleep(3000);
		
		create.passwordlinkMethod();
		Thread.sleep(3000);
		
		create.dateMethod();
		Thread.sleep(3000);
		
		create.monthMethod();
		Thread.sleep(3000);
		
		create.yearMethod();
		Thread.sleep(3000);
		
		create.malelinkMethod();
		Thread.sleep(3000);
		
	}

}