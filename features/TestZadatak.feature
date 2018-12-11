
@tag
Feature: Testing options 
  

  @tag1
  Scenario: Testing Sign up option using given data
    Given Open Chrome browser
    And go on a web page "https://www.rijksmuseum.nl/en"
    When I enter user name and valid email
    And enter password and confirm it
    Then user should be able to log in with submited 
    
  @tag2
  Scenario: Testing Sign in option using existing data
    Given Open Chrome browser, go on a web page "https://www.rijksmuseum.nl/en"
    And  navigate to Sign in option
    When enter defined user credentials, name and password
    And submit data
    Then user should be logged in
    
  @tag3
  Scenario: Create first colection
    Given Open Chrome browser, go to collectons page
    When user go to explore Rijksstudio and choose artist Johannes Vermeer
    And go to painting Milkmaid and add it to collection
    And user choose my new collection as a destination
    Then painting should be added to a created collection with message The work is added to the set My first collection' in your Rijksstudio
    
  @tag4  
  Scenario: Make an advanced search using the Page Object model
    Given Name,Title,Image selector,start date,end date
    When user search with this tags
    Then we should get at least 3 paintings 
  
 
    