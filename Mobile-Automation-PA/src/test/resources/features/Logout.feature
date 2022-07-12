Feature: Logout
  As a user
  I want to logout from account
  So that i successfully to logout from my account

  Scenario: As a user, i want to logout my account
    Given I am on the homepage
    When I click button profile
    And I click button keluar
    And I click button logout
    Then I get result Redirect to login page
