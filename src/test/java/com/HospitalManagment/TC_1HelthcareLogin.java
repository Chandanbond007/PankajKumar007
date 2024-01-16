package com.testcases.HospitalManagment;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.ActiTime.BaseTest;
import com.pagesHospitalManagment.AppointmentDetails;
import com.pagesHospitalManagment.AppointmentManagment;
import com.pagesHospitalManagment.EnterDataHealthcare;

public class TC_1HelthcareLogin extends BaseTest
{
	@Test
	public void login() throws InterruptedException, IOException
	{
		EnterDataHealthcare entry=new EnterDataHealthcare(driver);
		entry.enteremailMethod();
		Thread.sleep(2000);
		
		entry.enterpasswordMethod();
		Thread.sleep(2000);
		
		entry.loginMethod();
		Thread.sleep(2000);
				
		AppointmentDetails details=new AppointmentDetails(driver);
		details.appointmentMethod();
		Thread.sleep(2000);
		
		details.subappointmentMethod();
		Thread.sleep(2000);
		
		details.addappointmentMethod();
		Thread.sleep(2000);
		
		AppointmentManagment manage=new AppointmentManagment(driver);
		manage.dateMethod();
		Thread.sleep(3000);
		
		manage.timeMethod();
		Thread.sleep(3000);
		
		manage.selectpatientlinkMethod();
		Thread.sleep(3000);
		
		manage.patientnameMethod();
		Thread.sleep(3000);
		
		manage.submitMethod();
		Thread.sleep(3000);
	}

}