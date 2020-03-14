Feature: adding to card

  Scenario: Add to card

    Given Navigate to website
    And Search or "Teddy Bear"
    And Click on search button
    And Click on any item
    And Fill all the required fields
    And Click on Add to cart button
    Then Verify I am int the cart page
