@activity1_5
Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
    Given User on Login page
    When User enters "<Usernames>" and "<Passwords>" in login page
    Then Read the page title also the confirmation message
    And Close Firefox Browser
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |