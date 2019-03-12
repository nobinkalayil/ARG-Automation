Feature: Review
  As an end user
  I want to select products according to specific price range
  So that i can buy a product according to my preference

  @reg
  Scenario: Filter by Price range
    Given I am on homepage
    When I search for a product "nike"
    And I apply filter "£10 - £15" on search result
    Then I should see all products "range" are filtered "10-15"

  @reg
  Scenario: Filter By Rating
    Given I am on homepage
    When I search for a product "nike"
    And I apply filter "4or more" on search result
    Then I should see all products "review" are filtered "4.0"