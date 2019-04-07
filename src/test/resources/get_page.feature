Feature: Get a page from Wikipedia
  Get a page from wikipedia by calling a GET request to https://en.wikipedia.org/wiki/5_Whys

Scenario: User wants to get an article from Wikipedia
  Given that the server is running
  When user call GET on /article
  Then we return the full HTTP Response