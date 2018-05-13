Feature: Muuv Landing Page

  @Sanity
  Scenario: Open Muuv
    Given I open Muuv
    Then I should see landing page

  @Sanity
  Scenario: Open Sign Up modal
    Given I open Muuv
    When I click Sign Up
    Then I can view sign up modal

  @Sanity
  Scenario: Open Log In page
    Given I open Muuv
    When I click Log In
    Then I can view log in page
