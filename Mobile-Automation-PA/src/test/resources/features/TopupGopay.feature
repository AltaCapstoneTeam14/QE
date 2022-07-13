#Feature: Top up Gopay
#  As a user
#  I want to top up
#  So that I successfully to top up
#
#
#  Scenario: As a user, i want to topup with payment Gopay
#    Given I am on the homepage
#    When I click button topup
#    And I select nominal topup
#    And I click button lanjut
#    And I click button metode pembayaran
#    And I click Gopay
#    And I click bayar
#    And I input "654321"
#    Then I get the result Transaction successfully verified
#
#  Scenario: As a user, i want to top up without selecting available nominal
#    Given I am on the homepage
#    When I click button topup
#    And I click button lanjut
#    Then I get the result Please select the top up amout
#
#  Scenario: As a user , i want to top up without choose payment method
#    Given I am on the homepage
#    When I click button topup
#    And I select nominal topup
#    And I click button lanjut
#    And I click bayar
#    Then I get the result Please choose a payment method
#
#    Scenario: As a user, i want to top up with invalid pin code
#      Given I am on the homepage
#      When I click button topup
#      And I select nominal topup
#      And I click button lanjut
#      And I click button metode pembayaran
#      And I click Gopay
#      And I click bayar
#      And I input "112233"
#      Then I get the result PIN is not valid
#
#
#
