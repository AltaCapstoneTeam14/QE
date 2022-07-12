Feature: Login
  As a user
  I want to login
  So that I can access homepage

  Scenario Outline: Login Scenario

    Given I am on the login page
    When I input field "<email>" email login
    And I input field "<password>" password login
    And I click button sign in
    Then I get the "<result>"
    Examples:
      | email| password | result |
      | dhivas@gmail.com  | password      | redirectHomepage      |
      | random@mail.com   | password      | notRegisteredAccount  |
      | user              | password      | invalidEmail          |
      | user@mail.com     | wrong         | lessPassword          |
      |                   | password      | nullEmail             |
      | user@mail.com     |               | nullPassword          |

