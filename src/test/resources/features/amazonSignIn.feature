@regression @amazonSignIn
  Feature: Amazon Sign In test

    @amazonSignIn-1
    Scenario: Test Invalid login
      When I mouse over Hello, Sign In
      And I click on floating Sign-in
      And I write email address
      And I click on Continue button
      And I write the password
      And I click on final Sign-In button
      Then Verify invalid login error msg