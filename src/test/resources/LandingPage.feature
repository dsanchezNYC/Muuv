Feature: Muuv Landing Page

  Scenario: Open Muuv
    Given I open Muuv
    Then I should see landing page

  Scenario: Sign Up
    Given I open Muuv
    When I click Sign Up
    Then I can view sign up modal

  Scenario: Log In
    Given I open Muuv
    When I click Log In
    Then I can view log in page
