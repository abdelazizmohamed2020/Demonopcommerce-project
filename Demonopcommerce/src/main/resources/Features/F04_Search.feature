@smoke

  Feature: F04_Search | user could search for his needs

    Scenario Outline: Product Search using Product Name

      When  user click on search field
      And user search with "<product name>"
      Then user could find "<product name>" relative results
      Examples:
        | product name |
        |book   |
        |laptop   |
        |nike    |


    Scenario Outline: Product Search using Product SKU
      When  user click on search field second
      And user search with "<product_sku>" second
      Then user could find "<product_sku>" in product details
      Examples:
        | product_sku |
        | SCI_FAITH    |
        | APPLE_CAM    |
        | SF_PRO_11   |










