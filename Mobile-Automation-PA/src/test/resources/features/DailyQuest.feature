Feature: Daily Quest
  As a user
  I want to claim point in daily quest
  So that i successfully to claim point

  Scenario: As a user, i want to claim coin in daily quest
    Given I am on the homepage daily quest
    When I click button daily quest
    And I click button claim
    And I click button oke
    Then I get result get coins

  Scenario: As a user, i want to claim daily quest after claim before
    Given I am on the homepage daily quest
    When I click button daily quest
    And I click button claim
    Then I get result taken coins today

##  BUG