Feature: Login Authentication for OrangeHRM application

  Scenario: Successful login with valid input credentials
    Given User open application on chrome browser
    When user lands on login page
    Then user enter username and password
    |username|password|email|firstname|lastname|
      |Admin|admin123|sachin@fiberhome.com|sachin|sharma|
      |sachin|sachin123|xyz               |xyz   |xyz   |
      |kapil |kapil123 |bc                |xyz   |999   |
    And user clicks on submit button
    Then User lands on home Page.