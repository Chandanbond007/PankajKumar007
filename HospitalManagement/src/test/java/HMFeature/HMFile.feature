Feature: Login

@Sanity
Scenario: Successful Login With Valid Credentials
  Given User Launch Chrome browser 
	When User opens URL "http://106.51.87.42:9007/" 
	And User enters Email as "akhil@gmail.com" and Password as "123456" 
	And Click on Login
	Then Page Title should be "Doctor Dashboard - Hospital Management System1" 
	When User Click on Log out link 
	Then Page Title should be "Login | Hospital Management System" 
	And Close browser