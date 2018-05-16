Feature: Login

  @Smoke
  Scenario: Login with demo credentials
    Given I open Muuv
    When I click Log In
    And I use demo credentials
    Then I should be logged in successfully

  @Smoke
  Scenario: Login with valid username/password
    Given I open Muuv
    When I click Log In
    And I entered valid credentials
    Then I should be logged in successfully

#  @Smoke
#  Scenario: Login with invalid username/password
#    Given I open Muuv
#    When I click Log In
#    And I entered invalid credentials
#    Then I should be not be logged in
