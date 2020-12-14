$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/HooksTest.feature");
formatter.feature({
  "line": 1,
  "name": "Hooks",
  "description": "",
  "id": "hooks",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "tagged hook test_1",
  "description": "",
  "id": "hooks;tagged-hook-test-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "this is for third hook test",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksTestSteps.this_is_for_third_hook_test()"
});
formatter.result({
  "duration": 368850500,
  "status": "passed"
});
formatter.before({
  "duration": 1012600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "tagged hook test-2",
  "description": "",
  "id": "hooks;tagged-hook-test-2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "this is for first tag test",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksTestSteps.this_is_for_first_tag_test()"
});
formatter.result({
  "duration": 287800,
  "status": "passed"
});
formatter.after({
  "duration": 297800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "tagged hook test_3",
  "description": "",
  "id": "hooks;tagged-hook-test-3",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "this is for second tag test",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksTestSteps.this_is_for_second_tag_test()"
});
formatter.result({
  "duration": 145900,
  "status": "passed"
});
});