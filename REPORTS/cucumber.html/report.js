$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/LoginHashMap.feature");
formatter.feature({
  "line": 1,
  "name": "Login Authentication for OrangeHRM application",
  "description": "",
  "id": "login-authentication-for-orangehrm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login with valid input credentials",
  "description": "",
  "id": "login-authentication-for-orangehrm-application;successful-login-with-valid-input-credentials",
  "type": "scenario",
  "keyword": "Scenario"
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
  "name": "user enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "email",
        "firstname",
        "lastname"
      ],
      "line": 7
    },
    {
      "cells": [
        "Admin",
        "admin123",
        "sachin@fiberhome.com",
        "sachin",
        "sharma"
      ],
      "line": 8
    },
    {
      "cells": [
        "sachin",
        "sachin123",
        "xyz",
        "xyz",
        "xyz"
      ],
      "line": 9
    },
    {
      "cells": [
        "kapil",
        "kapil123",
        "bc",
        "xyz",
        "999"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User lands on home Page.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDefHashMap.user_open_application_on_chrome_browser()"
});
formatter.result({
  "duration": 564533100,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefHashMap.user_lands_on_login_page()"
});
formatter.result({
  "duration": 35200,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefHashMap.user_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 6136900,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefHashMap.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 92800,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefHashMap.user_lands_on_home_Page()"
});
formatter.result({
  "duration": 44300,
  "status": "passed"
});
});