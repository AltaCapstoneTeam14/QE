Feature: Edit Profile
  As a user
  I want to edit profile
  So that i successfully to edit profile

  Scenario Outline: Edit Profile
    Given I am on the homepage
    When I click button profile
    And I click button username
    And I input field "<name>" name edit profile
    And I input field "<email>" email edit profile
    And I input field "<phone number>" phone number edit profile
    And I click button simpan
    Then I get "<result>" in edit profile
    Examples:
      | name | email | phone number | result |
      | Karyna  | whal@gmail.com    | 08778845883            | UpdateSuccess      |
      | Karyna  | user102@gmail.com | 08778845883            | userExist          |
      | Karyna  | user              | 08778845883            | invalidEmail       |
      | Karyna  | whal@gmail.com    | 81888999882            | PhoneNumberExist   |
      | Karyna  | whal@gmail.com    | 087                    | lengthPhone        |
      | Karyna  | whal@gmail.com    | 0878787252365214852222 | lengthPhone        |
      | Karyna  |                   | 08778845883            | nullEmail          |
      | Karyna  | whal@gmail.com    |                        | nullPhone          |
