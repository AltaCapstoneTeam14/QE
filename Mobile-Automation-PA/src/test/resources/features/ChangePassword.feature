Feature: Change Password
  As a user
  I want to change my password
  So that i successfully to change my password

  Scenario Outline: Change Password Feature
    Given I am on the homepage
    When I click button profile
    And I click button change password
    And I click field "<password>" password
    And I click field "<confirm password>" confirm password
    And I click button simpan
    Then I get "<result>" in edit password
    Examples:
      | password | confirm password | result |
      | password | password         | updateSuccess        |
      | password | password2        | differentPassword    |
      |          | password         | nullPassword         |
      | password |                  | nullConfirmPassword  |
