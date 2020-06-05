$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook project",
  "description": "",
  "id": "facebook-project",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Facebook login",
  "description": "",
  "id": "facebook-project;facebook-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "prasads2209@gmail.com",
        "Yuva@143"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLogin.Enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 60553389347,
  "status": "passed"
});
});