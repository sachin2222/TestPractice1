Feature: Login Authentication for OrangeHRM application

  Scenario Outline: Successful login with valid input credentials
    Given User open application on chrome browser
    When user lands on login page
    Then user enter username"<username>"
    Then user enters password"<password>"
    And user clicks on submit button
    Then User lands on home Page.

    Examples:
    |username|password|
    |Admin   |admin123|


  Scenario Outline: Failure login with invalid input credentials
    Given User open application on chrome browser
    When user lands on login page
    Then user enter username"<username>"
    Then user enters password"<password>"
    And user clicks on submit button
    Then User should remains on login page

    Examples:
      |username|password|
      |sachin  |sachin123|

