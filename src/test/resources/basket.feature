Feature: Basket
  As an end user
  I want to add a product to basket
  So that i buy a product

  @r

  Scenario: Select a product

    Given I am on homepage
    When I search for a product "nike"
    And I select any product
    And I add the product to the basket
    Then The product should be in the basket


  @smoke
  Scenario: Select a product

    Given I am on homepage
    When I search for a product "puma"
    And I select any product
    And I add the product to the basket
    Then the product should be in the basket


