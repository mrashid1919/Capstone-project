@RetailPageTest

Feature: Retail Page

Background:
Given User is on Retail website 
And User click on MyAccount
When  User click on Login 
And User enter username "rashidma1@gmail.com" and password "123456"
And User click on Login button
Then User should be logged in to MyAccount dashboard

Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account link 
And User fill affiliate form with below information

|company|website|taxID|paymentMethod|
|Sysco|rashidsysco.com|0156552|cheque|

And User fill the Cheque Payee name
And User click on About us check box 
And User click on Continue button1 
Then User should see a success message1 

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on Edit your affiliate information link 
And user click on Bank Transfer radio button
And User fill Bank information with below information

|bankName|abaNumber|swiftCode|accountName|accountNumber|
|Azizi|152330|545980|Mohammad Rashid|132330563390|

And User click on Continue button2 
Then User should see a success message2

Scenario: Edit your account Information 
When User click on Edit your account information link 
Then User modify below information
	
	|firstname|lastName|email|telephone|
	|Mohammad|Rashid|rashidma12@gmail.com|6466450904|
	
And User click on continue button3 
Then User should see a message 'Success: Your account has been successfully updated.'

