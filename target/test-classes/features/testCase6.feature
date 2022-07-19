Feature: TestCase6
  Scenario: TC06 Your details have been submitted successfully
      Given navigate to "autoUrl"
      Then Verify that home page is visible successfully
      And Click on Contact Us button
      And Verify GET IN TOUCH is visible
      And Enter name, email, subject and message
      And Upload file
      And Click Submit button
      And Click OK button
      And Verify success message Success! Your details have been submitted successfully. is visible
      And Click Home button and verify that landed to home page successfully