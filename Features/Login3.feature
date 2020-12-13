Feature: Login Authentication for OrangeHRM application

  Scenario: Successful login with valid input credentials
    Given User open application on chrome browser
    When user lands on login page
    Then user enter username and password
      |Admin|admin123|
      |sachin|sachin123|
      |kapil |kapil123 |
    And user clicks on submit button
    Then User lands on home Page.