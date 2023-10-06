@userManagement
Feature: User management / access management

@validLogin @smokeTest
Scenario: user should be able to login with valid credentials
Given As a user, I am on the login page
When I enter valid usermail and valid password 
And Click on login button
Then I should be logged in
