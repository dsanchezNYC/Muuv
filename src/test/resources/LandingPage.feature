Feature: Muuv Landing Page

  @Smoke
  Scenario: Open Muuv
    Given I open Muuv
    Then I should see landing page

  @Smoke
  Scenario: Sign Up
    Given I open Muuv
    When I click Sign Up
    Then I can view sign up modal

  @Smoke
  Scenario: Log In
    Given I open Muuv
    When I click Log In
    Then I can view log in page
