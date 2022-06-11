@login
Feature: Login Feature
This feature file contains login related scenarios.

@ACAUTO-1 @smoke
Scenario: Successful Login Test
Given I am on login page
When I login with valid credentials
	|UserName | Password     |
	|Rameshwar| Selenium@123 |
Then I verify that the profile page is displayed	

@ACAUTO-2 @smoke
Scenario: Unsuccessful Login Test
Given I am on login page
When I login with valid credentials
	|UserName | Password     |
	|Invalid  | Invalid@123  |
Then I verify that the "Invalid username or password!" message is displayed	