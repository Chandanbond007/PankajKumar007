Feature: Login

@Functionality
Scenario: Successful login with customer details
  Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration" 
  Then click on Customers Major tab 
  And click on customers Minor tab
  Then page title must be "Customers / nopCommerce administration"
  Then click on add new button
  And user enter email as "abc@gmail.com" 
  And user enter pwd as "abc@123" 
  And user enter firstName as "PANKAJ" 
  And user enter lastName as "KUMAR"
  And click on Gender and select the checkbox
  And click on DOB and enter Dob as "3/13/1995"
  And user enter the company name as "LENEVO"
  And click on tax exempt checkbox
  And click on newsletter ans enter the store name
  And clicked on admin comment and enter the message as "Welcome To The Company"
  And clicked on save button