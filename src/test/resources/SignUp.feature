Feature: Muuv Sign Up

  @Smoke
  Scenario: Sign up with valid username/password
    Given I open Muuv
    When I click Sign Up
    And I entered valid username/password
    Then I should be logged in successfully

  @Smoke
  Scenario: Sign up with invalid username/password
    Given I open Muuv
    When I click Sign Up
    And I entered invalid username/password
    Then I should see username/password error