$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testcase.feature");
formatter.feature({
  "line": 2,
  "name": "JPetStore website",
  "description": "",
  "id": "jpetstore-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@JPetStore_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "To check that the application is taking the valid credentials.",
  "id": "jpetstore-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_jpetstorelogin"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user launched the chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user open the JPetStore website",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user enters the username and password clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "login_step.the_user_launched_the_chromebrowser()"
});
});