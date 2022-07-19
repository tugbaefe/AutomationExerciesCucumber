Feature: TestCase10
    Scenario: SUBSCRIPTION gorunurlulugu test edilir
      Given navigate to "autoUrl"
      Then Verify that home page is visible successfully
      And Scroll down to footer
      And Verify text SUBSCRIPTION
      And Enter email address in input and click arrow button
      And Verify success message You have been successfully subscribed! is visible