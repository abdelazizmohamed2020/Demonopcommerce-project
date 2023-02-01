@smoke


  Feature: F03_currencies | users could deal with different currencies

    Scenario: Verify the currency symbol on Home page

      When user select euro from currencies list
      Then Verify the Euro Symbol (€) is displayed on the 4 products in Home page
