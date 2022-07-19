
  Feature: TestCase11
    Scenario: Cart sayfasinda "You have been successfully subscribed!" mesaji test edilir
      Given navigate to "autoUrl"
      Then Verify that home page is visible successfully
      And Click Cart button
      And Scroll down to footer
      And Verify text SUBSCRIPTION
      And Enter email address in input and click arrow button
      And Verify success message You have been successfully subscribed! is visible