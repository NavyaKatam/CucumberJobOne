Feature: Search functionality

Scenario: Verify searching for an exisiting product
Given User navigates to landing page
When User enter an existing product "HP" into the search box field
And User clicks on Search button
Then Existing product should get dispalyed in the search results

Scenario: Verify searching for a non exisiting product
Given User navigates to landing page
When User enter a non existing product "Honda" into the search box field
And User clicks on Search button
Then Proper message should be displayed in the search results

Scenario: Verify searching without providing any product
Given User navigates to landing page
When User doesnt enter any produc into the search box field
And User clicks on Search button
Then Proper message should be displayed in the search results