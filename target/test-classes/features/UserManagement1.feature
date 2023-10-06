@userManagement
Feature: User management / access management

@validLogin @smokeTest
Scenario: user should be able to login with valid credentials
Given As a user, I am on the login page
When I enter valid usermail and valid password 
And Click on login button
Then I should be logged in


#Cucumber reuses the steps that are already implemented.
#if there are same two steps, cucumber only generates one step definition and reuses that step two steps

@invalidEmailLogin
Scenario: Invalid email login attempts
Given As a user, I am on the login page
When I enter valid usermail and valid password 
And Click on login button
Then I should see an error message "These credentials do not match our records." displays
And I should not be logged in

