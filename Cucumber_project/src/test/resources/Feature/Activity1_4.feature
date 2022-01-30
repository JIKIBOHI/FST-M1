@activity1_4
Feature: Data driven test without Example

Scenario: Testing with Data from Scenario
    Given User is on the Login page
    When User enters "admin" and "password"
    Then Read the title and confirmation message
    And Close the opened browser