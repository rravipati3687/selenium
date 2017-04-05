$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("A_LoginUser.feature");
formatter.feature({
  "id": "login-into-americangolf-application",
  "tags": [
    {
      "name": "@LoginUser",
      "line": 1
    }
  ],
  "description": "",
  "name": "Login into americangolf Application",
  "keyword": "Feature",
  "line": 3
});
formatter.scenario({
  "id": "login-into-americangolf-application;user-validates-login-functionality-for-americangolf-application",
  "description": "",
  "name": "User Validates login functionality for americangolf application",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "User is on americangolf home page by launching Login URL",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "User enter loginusername and loginpassword",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "User Clicks on login button",
  "keyword": "And ",
  "line": 7
});
formatter.match({
  "location": "AmericangolfLoginUser.UserisonamericangolfhomepagebylaunchingLoginURL()"
});
formatter.result({
  "duration": 25754212930,
  "status": "passed"
});
formatter.match({
  "location": "AmericangolfLoginUser.Userenterloginusernameandloginpassword()"
});
formatter.result({
  "duration": 1563306985,
  "status": "passed"
});
formatter.match({
  "location": "AmericangolfLoginUser.UserClicksonloginbutton()"
});
formatter.result({
  "duration": 13653000,
  "status": "passed"
});
formatter.uri("B_Home.feature");
formatter.feature({
  "id": "user-able-to-landed-on-the-americangolf-home-page",
  "tags": [
    {
      "name": "@Home",
      "line": 1
    }
  ],
  "description": "",
  "name": "User able to Landed on the americangolf home page",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "user-able-to-landed-on-the-americangolf-home-page;user-able-to-landed-on-the-americangolf-home-page",
  "description": "",
  "name": "User able to Landed on the americangolf home page",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "User is Landed on the americangolf home page",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "user clicks on the Home button",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "user clicks on the Golfclub button",
  "keyword": "And ",
  "line": 6
});
formatter.match({
  "location": "AmericangolfHome.userisUserisLandedontheamericangolfhomepage()"
});
formatter.result({
  "duration": 15427976,
  "status": "passed"
});
formatter.match({
  "location": "AmericangolfHome.userclicksontheHomebutton()"
});
formatter.result({
  "duration": 2866287838,
  "status": "passed"
});
formatter.match({
  "location": "AmericangolfHome.userclicksontheGolfclubbutton()"
});
formatter.result({
  "duration": 3950990035,
  "status": "passed"
});
});