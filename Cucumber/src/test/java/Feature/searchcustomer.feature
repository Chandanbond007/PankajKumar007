Feature: Login

@Sanity
Scenario: Successful login with customer details
 Given User Launch Chrome browser 
 When User opens URL "http://admin-demo.nopcommerce.com/login" 
 And User enters Email as "admin@yourstore.com" and Password as "admin" 
 And Click on Login
 Then Page Title should be "Dashboard / nopCommerce administration" 
 Then click on Customers Major tab 
 And click on customers Minor tab
 Then page title must be "Customers / nopCommerce administration"
 And User enters Comp as "Indian Cricket Team"
 And Click on search button
 Then Customer data validation should be "Indian Cricket Team"
 And Close browser
 