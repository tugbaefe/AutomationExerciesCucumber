Feature: TestCase1

  @aut
  Scenario: TC01 Register User olusturulur

    Given navigate to "autoUrl"
    Then Verify that home page is visible successfully
    And kullanici 2 saniye bekler
    And Click on Signup Login button
    And kullanici 1 saniye bekler
    And Verify New User Signup! is visible
    And kullanici 1 saniye bekler
    And Enter name and email address
    And kullanici 1 saniye bekler
    And Click Signup button
    And kullanici 1 saniye bekler
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And kullanici 1 saniye bekler
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!'
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And kullanici 1 saniye bekler
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And kullanici 1 saniye bekler
    And Verify that Logged in as username is visible
    And Click Delete Account buttons
    And kullanici 3 saniye bekler
    And Verify that ACCOUNT DELETED! is visible and click Continue button
    And Page closed

