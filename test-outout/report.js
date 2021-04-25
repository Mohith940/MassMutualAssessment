$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/featureFiles/values.feature");
formatter.feature({
  "line": 1,
  "name": "Value scenarios",
  "description": "",
  "id": "value-scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "",
  "description": "",
  "id": "value-scenarios;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "verify rigth \u003ccount\u003e of values are displyed on the screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "value-scenarios;;",
  "rows": [
    {
      "cells": [
        "count"
      ],
      "line": 10,
      "id": "value-scenarios;;;1"
    },
    {
      "cells": [
        "5"
      ],
      "line": 11,
      "id": "value-scenarios;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13668200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "lunch values applicatio",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericStepWithPageObject.lunch_values_applicatio()"
});
