@web @regression @amazon @sanity
Feature: Amazon Homepage features

  Background:
    Given I am on Amazon home page
    And I click on nav Sign-In

  @login-1 @Zeshan
  Scenario Outline: Verify Amazon search results
    When I search for an <item>
    Then I verify <specific item>

  Examples:
  |item          |specific item |
  |iPhone12      |iPhone12      |
  |Samsung S20   |Samsung S20   |
  |Samsung S20   |Samsung S20   |
  |Samsung S20   |Samsung S20   |
  |Samsung S20   |Samsung S20   |
  |Samsung S20   |Samsung S20   |
  |Samsung S20   |Samsung S20   |


  @login-2 @Zeshan
  Scenario: Verify Amazon search result
    When I search for an <item>
    Then I verify <specific item>

  @JIRATicket-12345
  Scenario: Verify Amazon search results
    When I search for an <item>
    Then I verify <specific item>

   @JIRATicket-321687
  Scenario: Verify Amazon search results
    When I search for an <item>
    Then I verify <specific item>





