#Feature: Register
#  As a user
#  I want to register account
#  So that i can success register account
#
#  Scenario Outline: As a user i want to register account
#
#    Given I am on the login page
#    When I click text sign up
#    And I input field fullname
#    And I input field "<email>" email
#    And I input field "<phoneNumber>" phone number
#    And I input field "<password>" password
#    And I input field "<confirmPassword>" confirm password
#    And I click button sign up
#    Then I get "<result>" in register
#    Examples:
#      | email | phoneNumber |  password |  confirmPassword | result |
#      | user5@gmail.com | 08752525421 | password | password     | redirectLogin       |
#      | user@gmail.com  | 08752525412 | password | password     | userExist           |
#      | user            | 08752525412 | password | password     | invalidEmail        |
#      | user@gmail.com  | 08752       | password | password     | lessNumbers         |
#      | user@gmail.com  | 08752525412 | pass     | password     | lessPassword        |
#      | user@gmail.com  | 08752525412 | password | difpassword  | differentPassword   |
#      |                 | 08752525412 | password | password     | nullEmail           |
#      | user@gmail.com  |             | password | password     | nullPhone           |
#      | user@gmail.com  | 08752525412 |          | password     | nullPassword        |
#      | user@gmail.com  | 08752525412 | password |              | nullConfirmPassword |
#
#
#
#
#
#
