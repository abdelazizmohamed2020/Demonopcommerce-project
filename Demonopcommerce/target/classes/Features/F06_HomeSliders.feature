@smoke

  Feature: F06_homeSliders | the two sliders

  Scenario: First slider is clickable on home page

    When I click on the first slider
    Then I should be redirected to the Nokia URL

  Scenario: Second slider is clickable on home page

    When I click on the second slider
    Then I should be redirected to the iphone URL