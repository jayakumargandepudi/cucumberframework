Feature: Test the loginpage functionality
@test
Scenario: Verify user is able to loginpage
    Given User open the browser
    Then  User should be on Indexpage
    When  User should click on login button
    Then  User should be on loginpage
           