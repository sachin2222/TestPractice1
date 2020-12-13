$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Authentication for OrangeHRM application",
  "description": "",
  "id": "login-authentication-for-orangehrm-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successful login with valid input credentials",
  "description": "",
  "id": "login-authentication-for-orangehrm-application;successful-login-with-valid-input-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User open application on chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user lands on login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username\"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters password\"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User lands on home Page.",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-authentication-for-orangehrm-application;successful-login-with-valid-input-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-authentication-for-orangehrm-application;successful-login-with-valid-input-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 13,
      "id": "login-authentication-for-orangehrm-application;successful-login-with-valid-input-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Successful login with valid input credentials",
  "description": "",
  "id": "login-authentication-for-orangehrm-application;successful-login-with-valid-input-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User open application on chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user lands on login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username\"Admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters password\"admin123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User lands on home Page.",
  "keyword": "Then "
});
formatter.match({
  "location": "orangeHRMSteps.user_open_application_on_chrome_browser()"
});
formatter.result({
  "duration": 37978713500,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMSteps.user_lands_on_login_page()"
});
formatter.result({
  "duration": 13370500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "orangeHRMSteps.user_enter_username(String)"
});
formatter.result({
  "duration": 130009800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 21
    }
  ],
  "location": "orangeHRMSteps.user_enters_password(String)"
});
formatter.result({
  "duration": 106504300,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMSteps.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 24629927200,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMSteps.user_lands_on_home_Page()"
});
formatter.result({
  "duration": 13520600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Failure login with invalid input credentials",
  "description": "",
  "id": "login-authentication-for-orangehrm-application;failure-login-with-invalid-input-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User open application on chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user lands on login page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enter username\"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user enters password\"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should remains on login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "login-authentication-for-orangehrm-application;failure-login-with-invalid-input-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 25,
      "id": "login-authentication-for-orangehrm-application;failure-login-with-invalid-input-credentials;;1"
    },
    {
      "cells": [
        "sachin",
        "sachin123"
      ],
      "line": 26,
      "id": "login-authentication-for-orangehrm-application;failure-login-with-invalid-input-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Failure login with invalid input credentials",
  "description": "",
  "id": "login-authentication-for-orangehrm-application;failure-login-with-invalid-input-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 17,
  "name": "User open application on chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user lands on login page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user enter username\"sachin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user enters password\"sachin123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should remains on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "orangeHRMSteps.user_open_application_on_chrome_browser()"
});
formatter.result({
  "duration": 9323795800,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMSteps.user_lands_on_login_page()"
});
formatter.result({
  "duration": 10676100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sachin",
      "offset": 20
    }
  ],
  "location": "orangeHRMSteps.user_enter_username(String)"
});
formatter.result({
  "duration": 121194000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sachin123",
      "offset": 21
    }
  ],
  "location": "orangeHRMSteps.user_enters_password(String)"
});
formatter.result({
  "duration": 98083600,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMSteps.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 3168414800,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMSteps.user_should_remains_on_login_page()"
});
formatter.result({
  "duration": 61400,
  "status": "passed"
});
});