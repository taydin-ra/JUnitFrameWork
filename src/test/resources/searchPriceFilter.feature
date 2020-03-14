Feature: Search price between 75 to 100

  Scenario: Search price between 75 to 100

    Given Navigate to website
    And Search or "Teddy Bear"
    And Click on search button
    And Click on price filter seventy five to hundred
    Then Verify all prices are between seventy five and hundred
