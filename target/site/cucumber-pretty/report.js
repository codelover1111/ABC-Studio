$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("news.feature");
formatter.feature({
  "line": 1,
  "name": "News feature",
  "description": "",
  "id": "news-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8539722150,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User is able to see news",
  "description": "",
  "id": "news-feature;user-is-able-to-see-news",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression-1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is home page of abcstudios.go.com",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click to news",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user able to see resent present realese",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user able to take screen Shot of news page",
  "keyword": "And "
});
formatter.match({
  "location": "NewsSD.userIsHomePageOfAbcstudiosGoCom()"
});
formatter.result({
  "duration": 134229159,
  "status": "passed"
});
formatter.match({
  "location": "NewsSD.userClickToNews()"
});
formatter.result({
  "duration": 4604169702,
  "status": "passed"
});
formatter.match({
  "location": "NewsSD.userAbleToSeeResentPresentRealese()"
});
formatter.result({
  "duration": 48393018,
  "status": "passed"
});
formatter.match({
  "location": "NewsSD.userAbleToTakeScreenShotOfHomePage()"
});
formatter.result({
  "duration": 689463155,
  "status": "passed"
});
formatter.after({
  "duration": 111280356,
  "status": "passed"
});
});