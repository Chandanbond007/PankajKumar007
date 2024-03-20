Feature: Login and Logout

@Functionality
Scenario: Creation and Deletion of a Types of Work
  Given User Launch Chrome browser 
	When User opens URL "https://online.actitime.com/dell1/login.do" 
	And User enters Email as "pk73501@gmail.com" and Password as "Laptop@123" 
	And Click on Login
	Then Page Title should be "actiTIME - Enter Time-Track"
	When User clicks on setting menu icon
	And Clcik on Types Of Work
	And Click on New Type button
	And User enter the type of work name as "Business"
	And User click on Save button
	And User clicks on checkbox of newly created work
	And User click on Delete Icon
	And User Click on Ok,Delete Icon
	And User refresh the page	