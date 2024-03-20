Feature: Login

@Functionality
Scenario: Successful Login With Valid Credentials
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User Click on Log out link 
	Then Page Title should be "Your store. Login" 
	And Close browser 
	
@Smoke	
Scenario Outline: Successful Login With Valid Credentials
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "<email>" and Password as "<password>" 
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration" 
	When User Click on Log out link 
	Then Page Title should be "Your store. Login" 
	And Close browser
	
Examples:
|email|password|
|admin@yourstore.com|admin|
|admin@yourstore.com|admin123|
|test@yourstore.com|admin|
|test@yourstore.com|admin12345|