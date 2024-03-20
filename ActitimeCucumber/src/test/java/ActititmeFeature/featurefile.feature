Feature: Login

@Sanity
Scenario: Successful Login With Valid Credentials
  Given User Launch Chrome browser 
	When User opens URL "https://online.actitime.com/dell1/login.do" 
	And User enters Email as "pk73501@gmail.com" and Password as "Laptop@123" 
	And Click on Login
	Then Page Title should be "actiTIME - Licenses"
	When User Click on Log out link 
	Then Page Title should be "actiTIME - Login" 
	And Close browser