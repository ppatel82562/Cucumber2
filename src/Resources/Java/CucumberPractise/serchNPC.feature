@serch
Feature: serch the product

  Scenario: User able to serch product from serch box
    Given User on home page
    When User enter "<product>" name in serch box
    Then user able to serch the product
