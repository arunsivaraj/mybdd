Feature: User login

  Scenario: User is able to login with valid creds
    Given User enters valid username
    And User enters valid password
    When User clicks on Login button
    Then User is logged in successfully

  Scenario: User is not able to login with invalid creds
    Given User enters invalid username
    And User enters invalid password
    When User clicks on Login button
    Then error message is displayed

