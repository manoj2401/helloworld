Feature: Home loan application validation

@SmokeTest
Scenario Outline: User logs into home loan application

Given user opens browser
When user is on bank Login Page
Then user enters "<username>" and "<password>"

Examples: 
		|username|password|
		|naveenk |Test@123|

@SmokeTest
Scenario: Validate account holder details to notify customer eligible for pre approved home loan

Given user is on bank home Page
Then user enters bank details
Then user validate account holder details
Then notify customer eligible for pre approved loan

@SmokeTest
Scenario: Evaluate customer info to determine emi

Given user is on bank customer info Page
When user fetch customer details 
Then validate customer eligible for how much emi
Then bank process emi

@SmokeTest
Scenario: Verify Bank loan criteria and home loan tenure and percentage

Given user is on bank loan page
When user fetches property price
Then validate home loan percentage
Then validate home loan tenure






























