Feature: Cashout
  As a user
  I want to cashout with my coin
  So that i successfully to redeem cashout


  Scenario: As a user, i want to redeem my coin
    Given I am on the homepage
    When I click button cashout
    And I click nominal cashout
    And I click button lanjut
    And I click button bayar
    Then I get result Cashout Success

  Scenario: As a user, i want to redeem with insufficient coin
    Given I am on the homepage with no balance in the account
    When I click button cashout
    And I click nominal cashout
    And I click button lanjut
    And I click button bayar
    Then I get result Coin not enough

  Scenario: As a user, i want to redeem without selected nominal amount
    Given I am on the homepage
    When I click button cashout
    And I click button lanjut
    And I click button bayar
    Then I get result select the cashout amount