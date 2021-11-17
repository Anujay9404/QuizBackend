#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

Feature: Test the login functionality on quiz login app

  Scenario: Home page should be displayed
    Given Open the quiz application
    And click on login button
    When User enter Email
    And User enter password
    And click on login button
    Then Redirect to view page
  