Feature: Login functionality

Scenario: Verify Login with valid credentials
Given User navigates to Login page
When User enters valid email "amotooricap1@gmail.com" into the email address field
And User enters valid password "12345" into the password field
And User clicks on Login button
Then User should get successfully logged in

Scenario: Verify Login wiht invalid credentials
Given User navigates to Login page
When User enters invalid email into the email address field
And User enters invalid password "123456" into the password field
And User clicks on Login button
Then User should get a proper warning message

Scenario: Verify Login wiht valid email address and invalid password credentials
Given User navigates to Login page
When User enters valid email "amotooricap2@gmail.com" into the email address field
And User enters invalid password "123456" into the password field
And User clicks on Login button
Then User should get a proper warning message

Scenario: Verify Login wiht invalid email address and valid password credentials
Given User navigates to Login page
When User enters invalid email into the email address field
And User enters valid password "12345" into the password field
And User clicks on Login button
Then User should get a proper warning message
