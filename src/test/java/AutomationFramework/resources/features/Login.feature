@Login
Feature: Login to GitLab account 
	Existing user should be able to log into account using correct credientials

Background:
	Given User navigates to GitLab website
	And User enters a valid username

@loginSuccess
Scenario Outline: Login with correct credentials 
	And User enters a valid password
	When User clicks on login button
	Then User should be taken to login screen 
	

	
@loginFailure
Scenario Outline: Login with incorrect credentials
	And User enters an invalid password 
	When User clicks on login button 
	Then User should see login failure message