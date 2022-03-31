@web @regression @amazon @sanity @cOut
  Feature: Amazon Checkout Feature

    Background:
      Given I am on Amazon home page

    @checkout-1 @cart
    Scenario: Add a iPhone to cart
      When I click on search box
      And I write iPhone 12 in search box
      And I click on search icon
      And I select "Apple iPhone 12 Pro Max, 128GB, Pacific Blue - Fully Unlocked"
      And I click on Add to cart
      Then I verify iPhone 12 is added in my cart


    @checkout-2 @cart @test
    Scenario: Another scenario
      When I click on search box
      And I write iPad Air in search box
      And I click on search icon
      And I select "Apple iPhone 12 Pro Max, 128GB, Pacific Blue - Fully Unlocked"
      And I click on Add to cart
      Then I verify iPhone 12 is added in my cart

    @checkout-3 @test
    Scenario Outline: Verify multiple items can be added to cart
      When I click on search box
      And I write <itemName> in search box
      And I click on search icon
      And I select "Apple iPhone 12 Pro Max, 128GB, Pacific Blue - Fully Unlocked"
      And I click on Add to cart
      Then Verify <cartItem> is added to my Amazon cart for appropriate <itemName>
      Examples:
      |itemName      | cartItem                                                        |
      |counter table |ACME Cargo Counter Height Table - - Antique Walnut & Gunmetal    |
      |counter chair |ALPHA HOME Bar Stools Counter Height Adjustable Swivel Bar Chair |
      |Mug           |SUNWILL Coffee Mug with Handle, 14oz Insulated Stainless Steel   |