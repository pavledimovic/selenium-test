$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestZadatak.feature");
formatter.feature({
  "line": 3,
  "name": "Testing options",
  "description": "",
  "id": "testing-options",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Testing Sign up option using given data",
  "description": "",
  "id": "testing-options;testing-sign-up-option-using-given-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "signUpTest.Open_Chrome_browser()"
});
formatter.result({
  "duration": 3271976334,
  "status": "passed"
});
formatter.step({
  "line": 9,
  "name": "go on a web page \"https://www.rijksmuseum.nl/en\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.rijksmuseum.nl/en",
      "offset": 18
    }
  ],
  "location": "signUpTest.go_on_a_web_page(String)"
});
formatter.result({
  "duration": 10713696742,
  "status": "passed"
});
formatter.step({
  "line": 10,
  "name": "I enter user name and valid email",
  "keyword": "When "
});
formatter.match({
  "location": "signUpTest.I_enter_user_name_and_valid_email()"
});
formatter.result({
  "duration": 450073628,
  "status": "passed"
});
formatter.step({
  "line": 11,
  "name": "enter password and confirm it",
  "keyword": "And "
});
formatter.match({
  "location": "signUpTest.enter_password_and_confirm_it()"
});
formatter.result({
  "duration": 3094482034,
  "status": "passed"
});
formatter.step({
  "line": 12,
  "name": "user should be able to log in with submited",
  "keyword": "Then "
});
formatter.match({
  "location": "signUpTest.user_should_be_able_to_log_in_with_submited()"
});
formatter.result({
  "duration": 51103668,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@href\u003d\u0027/en/rijksstudio/my\u0027]\"}\n  (Session info: chrome\u003d71.0.3578.80)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:42:28.403Z\u0027\nSystem info: host: \u0027DESKTOP-KF0H7EQ\u0027, ip: \u0027192.168.0.15\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_192\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61248}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.80, webStorageEnabled: true}\nSession ID: b75765600fed21b7d9cefa53dc2d46c8\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027/en/rijksstudio/my\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat stepDefinition.signUpTest.user_should_be_able_to_log_in_with_submited(signUpTest.java:67)\r\n\tat ✽.Then user should be able to log in with submited(TestZadatak.feature:12)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 15,
  "name": "Testing Sign in option using existing data",
  "description": "",
  "id": "testing-options;testing-sign-in-option-using-existing-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Open Chrome browser, go on a web page \"https://www.rijksmuseum.nl/en\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.rijksmuseum.nl/en",
      "offset": 39
    }
  ],
  "location": "signInTest.Open_Chrome_browser_go_on_a_web_page(String)"
});
formatter.result({
  "duration": 5208636028,
  "status": "passed"
});
formatter.step({
  "line": 17,
  "name": "navigate to Sign in option",
  "keyword": "And "
});
formatter.match({
  "location": "signInTest.navigate_to_Sign_in_option()"
});
formatter.result({
  "duration": 4128693117,
  "status": "passed"
});
formatter.step({
  "line": 18,
  "name": "enter defined user credentials, name and password",
  "keyword": "When "
});
formatter.match({
  "location": "signInTest.enter_defined_user_credentials_name_and_password()"
});
formatter.result({
  "duration": 3372233844,
  "status": "passed"
});
formatter.step({
  "line": 19,
  "name": "submit data",
  "keyword": "And "
});
formatter.match({
  "location": "signInTest.submit_data()"
});
formatter.result({
  "duration": 4166593919,
  "status": "passed"
});
formatter.step({
  "line": 20,
  "name": "user should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "signInTest.user_should_be_logged_in()"
});
formatter.result({
  "duration": 3134436120,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Create first colection",
  "description": "",
  "id": "testing-options;create-first-colection",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Open Chrome browser, go to collectons page",
  "keyword": "Given "
});
formatter.match({
  "location": "createCollectionTest.Open_Chrome_browser_go_to_collectons_page()"
});
formatter.result({
  "duration": 10172878752,
  "status": "passed"
});
formatter.step({
  "line": 25,
  "name": "user go to explore Rijksstudio and choose artist Johannes Vermeer",
  "keyword": "When "
});
formatter.match({
  "location": "createCollectionTest.user_go_to_explore_Rijksstudio_and_choose_artist_Johannes_Vermeer()"
});
formatter.result({
  "duration": 13304836432,
  "status": "passed"
});
formatter.step({
  "line": 26,
  "name": "go to painting Milkmaid and add it to collection",
  "keyword": "And "
});
formatter.match({
  "location": "createCollectionTest.go_to_painting_Milkmaid_and_add_it_to_collection()"
});
formatter.result({
  "duration": 5202789944,
  "status": "passed"
});
formatter.step({
  "line": 27,
  "name": "user choose my new collection as a destination",
  "keyword": "And "
});
formatter.match({
  "location": "createCollectionTest.user_choose_my_new_collection_as_a_destination()"
});
formatter.result({
  "duration": 4129176043,
  "status": "passed"
});
formatter.step({
  "line": 28,
  "name": "painting should be added to a created collection with message The work is added to the set My first collection\u0027 in your Rijksstudio",
  "keyword": "Then "
});
formatter.match({
  "location": "createCollectionTest.painting_should_be_added_to_a_created_collection_with_message_The_work_is_added_to_the_set_My_first_collection_in_your_Rijksstudio()"
});
formatter.result({
  "duration": 6745481491,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Make an advanced search using the Page Object model",
  "description": "",
  "id": "testing-options;make-an-advanced-search-using-the-page-object-model",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@tag4"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Name,Title,Image selector,start date,end date",
  "keyword": "Given "
});
formatter.match({
  "location": "pageObjectMethodTest.Name_Title_Image_selector_start_date_end_date()"
});
formatter.result({
  "duration": 14316650179,
  "status": "passed"
});
formatter.step({
  "line": 33,
  "name": "user search with this tags",
  "keyword": "When "
});
formatter.match({
  "location": "pageObjectMethodTest.user_search_with_this_tags()"
});
formatter.result({
  "duration": 53575312,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(@class,\u0027search-view-button button-like button-big bg-lighter mobile-lg-1-2 mobile-lg-reset-margin-left\u0027)]\"}\n  (Session info: chrome\u003d71.0.3578.80)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:42:28.403Z\u0027\nSystem info: host: \u0027DESKTOP-KF0H7EQ\u0027, ip: \u0027192.168.0.15\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_192\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61397}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.80, webStorageEnabled: true}\nSession ID: b2b5ed394f7c7ec02b6b1b9686473b49\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(@class,\u0027search-view-button button-like button-big bg-lighter mobile-lg-1-2 mobile-lg-reset-margin-left\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat pageObjects.AdvancedSearchPage.CollectionSearch(AdvancedSearchPage.java:70)\r\n\tat stepDefinition.pageObjectMethodTest.user_search_with_this_tags(pageObjectMethodTest.java:41)\r\n\tat ✽.When user search with this tags(TestZadatak.feature:33)\r\n",
  "status": "failed"
});
formatter.step({
  "line": 34,
  "name": "we should get at least 3 paintings",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 23
    }
  ],
  "location": "pageObjectMethodTest.we_should_get_at_least_paintings(int)"
});
formatter.result({
  "status": "skipped"
});
});