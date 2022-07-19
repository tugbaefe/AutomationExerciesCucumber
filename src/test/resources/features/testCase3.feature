
  Feature: TestCase3
    @auto3
    Scenario: TC03 incorrect email and password test edilir
      Given navigate to "autoUrl"
      Then Verify that home page is visible successfully
      And Click on Signup Login button
      And Verify Login to your account is visible
      And Enter incorrect email address and password
      And Click login button
      And Verify error Your email or password is incorrect! is visible
      And Page closed
