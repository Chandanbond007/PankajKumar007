Feature: Login and Logout

@Functionality
Scenario: Creation and Deletion of a Leaves Types
  Given User Launch Chrome browser 
	When User opens URL "https://online.actitime.com/dell1/login.do" 
	And User enters Email as "pk73501@gmail.com" and Password as "Laptop@123" 
	And Click on Login
	Then Page Title should be "actiTIME - Enter Time-Track"
	When User clicks on setting menu icon
	And Clcik on Leave Types
	And Click on New Type button of Leave Type
	And User enter the type of Leave name as "Personal"
	And User click on Save button of Create Leave Type
	And User clicks on action dots of newly created leave
	And User click on Delete Icon of Leave Types
	And User Click on Ok,Delete Icon of Leave Types
	And Close the browser	