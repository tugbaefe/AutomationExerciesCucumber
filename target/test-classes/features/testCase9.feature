Feature: TestCase8

  Scenario: Butun urunler goruntulenir

      Given navigate to "autoUrl"
      Then Verify that home page is visible successfully
      And Click on Products button
      And Verify user is navigated to ALL PRODUCTS page successfully
      And Enter product name in search input and click search button
      And Verify SEARCHED PRODUCTS is visible
      And Verify all the products related to search are visible