#Feature: Edit Profile
#  As a user
#  I want to edit profile
#  So that i successfully to edit profile
#
#  Scenario Outline: Edit Profile
#    Given I am on the homepage
#    When I click button profile
#    And I click button username
#    And I input field "<name>" name edit profile
#    And I input field "<email>" email edit profile
#    And I input field "<phone number>" phone number edit profile
#    And I click button simpan
#    Then I get "<result>" in edit profile
#    Examples:
#      | name | email | phone number | result |
#      | Karyna  | whale@gmail.com    | 08778845882        | UpdateSuccess      |
#      | Karyna  | user@mail.com      | 08778845882        | userExist          |
#      | Karyna  | user               | 08778845882        | invalidEmail       |
#      | Karyna  | whale@gmail.com    | 81888999882        | PhoneNumberExist   |
#      | Karyna  | whale@gmail.com    | 087                | lengthPhone        |
#      | Karyna  | whale@gmail.com    | 087878725236521485 | lengthPhone        |
#      | Karyna  |                    | 08778845882        | nullEmail          |
#      | Karyna  | whale@gmail.com    |                    | nullPhone          |
