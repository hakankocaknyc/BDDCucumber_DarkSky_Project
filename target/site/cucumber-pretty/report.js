$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSkyHome.feature");
formatter.feature({
  "line": 3,
  "name": "DarkSkyHomePage feature",
  "description": "",
  "id": "darkskyhomepage-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 19436266968,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on Dark Sky home page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkyHomeSD.setDarkSkyHomePage()"
});
formatter.result({
  "duration": 1571361042,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify the lowest and highest temp is displayed correctly",
  "description": "",
  "id": "darkskyhomepage-feature;verify-the-lowest-and-highest-temp-is-displayed-correctly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@DarkSkyHome"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I click on Today button and expand it",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I get lowest temperature, verify displayed temperature",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I get highest temperature, verify displayed temperature",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkyHomeSD.i_click_on_Today_button_and_expand_it()"
});
formatter.result({
  "duration": 174373327,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyHomeSD.i_get_lowest_temperature_verify_displayed_temperature()"
});
formatter.result({
  "duration": 707938001,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyHomeSD.i_get_highest_temperature_verify_displayed_temperature()"
});
formatter.result({
  "duration": 316056210,
  "status": "passed"
});
formatter.after({
  "duration": 332366222,
  "status": "passed"
});
});