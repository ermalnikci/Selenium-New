@regression @amazon
Feature: Amazon Cart Functionality

  Background:
    Given I am on Amazon home page

  Scenario: Verify user can add products to cart
    When I search for iPad
    And I scroll down to Apple iPhone 12 Pro, 128GB, Gold - Fully Unlocked (Renewed)
#    And I click on add to cart button
    And I click on my cart
    Then I should see iPhone 13(256GB, Pink) in my cart





