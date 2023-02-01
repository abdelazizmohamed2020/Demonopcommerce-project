@smoke

  Feature: F05_hoverCategories | users could hover on one of main categories

    Scenario: user hover on categories

      When user hover categories
      And user click on subcategory
      Then user go to product page