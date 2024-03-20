Feature: Login

@Functionality
Scenario: Creation and Deletion of a new Customer
  Given User Launch Chrome browser 
	When User opens URL "https://online.actitime.com/dell1/login.do" 
	And User enters Email as "pk73501@gmail.com" and Password as "Laptop@123" 
	And Click on Login
	Then Page Title should be "actiTIME - Enter Time-Track" 
	When User Click on Tasks Link
	And User Click on Add New option
	And User Click on New Customers link
	And User enter Customer Name as "Pankaj"
	And User Click on Create Customer Link 
	And User click on customer settings icon
	And User click on actions icon
	And User click on delete link
	And User click on delete permanently button 
	And Close browser