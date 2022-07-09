Feature: Paket Data
  As a user
  I want to buy paket data
  So that i successfully to buy paket data
#
#  Scenario: As a user, i want to buy paket data
#    Given I am on the homepage
#    When I click button paket data
#    And I input field nomer telepon
#    And I choose operator
#    And I click provider
#    And I click kuota nominal
#    And I click lanjut
#    And I click bayar
#    Then I get result Buy Paket Data Success
#
#  Scenario: As a user, i want to buy paket data without entering Nomer Telepon
#    Given I am on the homepage
#    When I click button paket data
#    And I choose operator
#    And I click provider
#    And I click kuota nominal
#    And I click lanjut
#    Then I get result please enter phone number
#
#  Scenario: As a user, i want to buy paket data without selecting available nominal
#    Given I am on the homepage
#    When I click button paket data
#    And I input field nomer telepon
#    And I choose operator
#    And I click provider
#    And I click lanjut
#    Then I get result please select the kuota amount
#
#  Scenario: As a user, i want to buy paket data without have saldo
#    Given I am on the homepage with no balance in the account
#    When I click button paket data
#    And I input field nomer telepon
#    And I choose operator
#    And I click provider
#    And I click kuota nominal
#    And I click lanjut
#    And I click bayar
#    Then I get result your balance is not enough
#
  Scenario: As a user, i want to buy paket data with less numbers 10
    Given I am on the homepage
    When I click button paket data
    And I input field nomer telepon less numbers
    And I choose operator
    And I click provider
    And I click pulsa nominal
    And I click lanjut
    Then I get result The length of phone must be between 10 and 14 characters

  Scenario: As a user, i want to buy paket data with more than numbers 14
    Given I am on the homepage
    When I click button paket data
    And I input field nomer telepon more than numbers
    And I choose operator
    And I click provider
    And I click pulsa nominal
    And I click lanjut
    Then I get result The length of phone must be between 10 and 14 characters