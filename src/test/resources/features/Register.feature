Feature: Register Functionality

Scenario: Verify Registering Account by providing only mandatory fields
Given User navigates to Register Account page 
When User enters the below fields
|firstName|Arun				|
|lastName	|Motoori		|
|telephone|1234567890	|
|password	|12345			|
And User selects Privacy Policy field
And User clicks on Continue button
Then User Account should get created successfully

Scenario: Verify Registering Account by providing all fields
Given User navigates to Register Account page
When User enters the below fields
|firstName|Arun				|
|lastName	|Motoori		|
|telephone|1234567890	|
|password	|12345			|
And User selects Yes Newsletter option
And User selects Privacy Policy field
And User clicks on Continue button
Then User Account should get created successfully

Scenario: Verify Registering Account by subscribing to Newsletter
Given User navigates to Register Account page
When User enters the below fields
|firstName|Arun				|
|lastName	|Motoori		|
|telephone|1234567890	|
|password	|12345			|
And User selects Yes Newsletter option
And User clicks on Continue button
And User clicks on Continue button on Account Success page
And User selects Subscribe Unsubscribe Newsletter option
Then User should be taken to Nesletter page
And Yes radio button should be in selected state

Scenario: Verify Registering Account by not subscribing to Newsletter
Given User navigates to Register Account page
When User enters the below fields
|firstName|Arun				|
|lastName	|Motoori		|
|telephone|1234567890	|
|password	|12345			|
And User selects No Newsletter option
And User clicks on Continue button
And User clicks on Continue button on Account Success page
And User selects Subscribe Unsubscribe Newsletter option
Then User should be taken to Nesletter page
And No radio button should be in selected state