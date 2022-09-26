Feature: login feature

Scenario: as a user using valid cradantial should be logged
Given open browser
And navigate to url

When user type email in userTest box
And user type password in userTest box
And user click login in userTest box
Then user should see his profile page



