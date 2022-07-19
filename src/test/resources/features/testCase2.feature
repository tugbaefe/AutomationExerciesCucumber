
  Feature: TestCase2
    Scenario: TC02 login to your account test edilir
      Given navigate to "autoUrl"
      Then Verify that home page is visible successfully
      And Click on Signup Login button
      And Verify Login to your account is visible
      And Enter correct email address and password
      And Click login button
      And kullanici 3 saniye bekler
      And Verify that Logged in as username is visible
      And Click Delete Account button
      And Verify that ACCOUNT DELETED! is visible
      And Page closed
