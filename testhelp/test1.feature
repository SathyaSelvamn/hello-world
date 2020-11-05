Feature: To validate the functionality of facebook

Scenario: To test the login functionality

Given the user enter the login page
|https://www.facebook.com|
When the user enters the username and password
|sathya@123 | wel12345|
And clicks the login
Then the user home page