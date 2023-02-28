Feature: Home Page

Background:
Given User should be on the loginpage
When  User should on homepage

@retest
Scenario:
Then verify the myAccount field is displayed

@retest
Scenario:
Then verify the requestCheckbook link field is displayed
And click on the logout